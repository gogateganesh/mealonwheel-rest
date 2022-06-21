package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.repositories.Customerrepo;

@Service
public class CustomerService 
{
	@Autowired
	Customerrepo customerrepo;
	
	public Customer register(Customer c)
	{
		return customerrepo.save(c);
	}
	
	public Customer getOneCustomer(int loginid)
	{
		return customerrepo.getOneCustomer(loginid);
	}
	
	public Customer getByCustid(int id)
	{
		return customerrepo.getByCustId(id);
	}

}
