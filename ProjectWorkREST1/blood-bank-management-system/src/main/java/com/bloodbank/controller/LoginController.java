package com.bloodbank.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.serviceimpl.LoginService;
import com.bloodbank.dto.*;
import com.bloodbank.model.AdminBean;
import javax.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/loginSuccessFull")
	public LoginResponseDto displayAll() {
		LoginResponseDto loginResponseDto = new LoginResponseDto();
		loginResponseDto.setDonorList(loginService.getDonors());
		loginResponseDto.setRequestList(loginService.getRequests());
		loginResponseDto.setBloodStorageList(loginService.getBloodBanks());	
		return loginResponseDto;
	}
	

	@RequestMapping(value="/adminLogin" , method=RequestMethod.POST)
	public AdminBean getAdmin(@RequestBody AdminBean admin)
	{
		return loginService.getAdminDetails(admin.getAdminId(), admin.getAdminPassword());
	}

}
