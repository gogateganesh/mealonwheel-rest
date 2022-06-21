package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Login;
import com.example.demo.repositories.Customerrepo;
import com.example.demo.repositories.Loginrepo;
import com.example.demo.repositories.ServiceProviderRepo;

@Service
public class LoginService {
	
	@Autowired
	Loginrepo loginrepo;

	@Autowired
	Customerrepo customerrepo;
	
	@Autowired
	ServiceProviderRepo spr;
	
	public Object checkLogin(String username,String password)
	{
		Login loginobj = loginrepo.checkLogin(username, password);
		System.out.println(loginobj);
		if(loginobj!=null)
		{
			if(loginobj.getRole().equals("customer"))
			{
			return customerrepo.getOneCustomer(loginobj.getLoginid());
			}
			if (loginobj.getRole().equals("provider")) {
			return spr.getOneSP(loginobj);
			}
		}
		return null;
		
	}
	
	public String changePassword(String username,String oldpassword,String newpassword)
	{
		return ""+loginrepo.changePassword(username, oldpassword, newpassword);
	}
	
	public Login save(Login login)
	{
		return loginrepo.save(login);
	}
}
