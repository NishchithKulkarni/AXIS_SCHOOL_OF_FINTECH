package com.bloodbank.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.dao.BloodBankDao;
import com.bloodbank.model.BloodStorageBean;
import java.util.List;

@Service
public class EnquireService {
	
	@Autowired
	private BloodBankDao bloodbankDao;
	
	public String getAmount(String blood_type,String city)
	{
		return bloodbankDao.findAmount(blood_type, city);
	}
	public List<BloodStorageBean> getBloodStorageDetails()
	{
		return bloodbankDao.findAll();
	}
}
