package com.bloodbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bloodbank.model.RequestBean;

@Repository
public interface LoginRequestDao extends JpaRepository<RequestBean , Integer>{
	
	//@Query("SELECT req FROM requests req")
	//public List<RequestBean> requestDisplay();
	
}