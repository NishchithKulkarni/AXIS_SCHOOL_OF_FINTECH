package com.bloodbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bloodbank.model.AdminBean;

@Repository
public interface AdminDao extends JpaRepository<AdminBean, String>{
	
	@Query(value = "SELECT a FROM admin a WHERE a.admin_id=:(adminId) AND a.admin_password=:(adminPassword)", nativeQuery = true)
	public AdminBean findByAdminIdAndAdminPassword(@Param("adminId") String adminId,@Param("adminPassword") String adminPassword);

}