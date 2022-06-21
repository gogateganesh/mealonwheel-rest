package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bodyobj.ChangePwd;
import com.example.demo.entities.Login;
import com.example.demo.services.LoginService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:80"})
public class LoginController 
{
	@Autowired
	LoginService service;
	
	@PostMapping("/postlogin") //post method to check login
	public Object postuser(@RequestBody Login login) 
	{
		Object obj= service.checkLogin(login.getUsername(), login.getPassword());
		if(obj!=null)
		{
			return obj;
		}
		return "";
	}
	
	@PostMapping("/loginsave") //to create login data
	public Login postname(@RequestBody Login login) 
	{
	    return service.save(login);
	}
	
	@GetMapping("/chpwd") //end point to change password
	public String chpwd(@RequestBody ChangePwd obj)
	{
		return service.changePassword(obj.getUsername(), obj.getOldpassword(), obj.getNewpassword());
	}
	
}

