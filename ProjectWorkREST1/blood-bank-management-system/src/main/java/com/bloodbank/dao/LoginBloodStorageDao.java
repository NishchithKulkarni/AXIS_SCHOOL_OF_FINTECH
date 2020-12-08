package com.bloodbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bloodbank.model.BloodStorageBean;

@Repository
public interface LoginBloodStorageDao extends JpaRepository<BloodStorageBean , Integer>{
	
	//@Query("SELECT b FROM blood_storage b")
	//public List<BloodStorageBean> bloodStorageDisplay();
	
}
