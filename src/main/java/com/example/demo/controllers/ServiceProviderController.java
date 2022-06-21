package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bodyobj.ServiceProviderRegistration;
import com.example.demo.entities.Login;
import com.example.demo.entities.ServiceProvider;
import com.example.demo.services.LoginService;
import com.example.demo.services.ServiceProviderService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:80"})
public class ServiceProviderController 
{
	@Autowired
	ServiceProviderService sps;
	
	@Autowired
	LoginService ls;
	
	@PostMapping("/register_provider") //register the customer
	public ServiceProvider register(@RequestBody ServiceProviderRegistration spr) 
	{
		Login loginobj = new Login();
		loginobj.setUsername(spr.getEmail());
		loginobj.setPassword(spr.getPassword());
		loginobj.setRole("provider");
		ServiceProvider spobj = new ServiceProvider(spr.getName(),spr.getAddress(),spr.getEmail(),spr.getPhone(),spr.getDate_recorded(),loginobj);
		return sps.add(spobj);
	}
	
}
