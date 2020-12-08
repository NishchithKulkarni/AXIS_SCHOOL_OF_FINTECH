package com.bloodbank.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.dao.AdminDao;
import com.bloodbank.dao.LoginBloodStorageDao;
import com.bloodbank.dao.LoginDonorDao;
import com.bloodbank.dao.LoginRequestDao;
import com.bloodbank.model.AdminBean;
import com.bloodbank.model.BloodStorageBean;
import com.bloodbank.model.DonorBean;
import com.bloodbank.model.RequestBean;

@Service
public class LoginService {
	@Autowired
	private LoginRequestDao loginReqDao;
	
	@Autowired
	private LoginDonorDao loginDonDao;
	
	@Autowired
	private LoginBloodStorageDao loginBloodDao;
	
	@Autowired
	private AdminDao adminDao;

	
	public List<RequestBean> getRequests()
	{
		return loginReqDao.findAll();
	}
	
	public List<DonorBean> getDonors()
	{
		return loginDonDao.findAll();
	}
	
	public List<BloodStorageBean> getBloodBanks()
	{
		return loginBloodDao.findAll();
	}
	
	public AdminBean getAdminDetails(String adminId,String adminPassword)
	{
		return adminDao.findByAdminIdAndAdminPassword(adminId, adminPassword);
	}

}
