package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.services.CustomerService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:80"})
public class CustomerController 
{
	@Autowired
	CustomerService service;
	
	@PostMapping("/register_customer") //register the customer
	public Customer register(@RequestBody Customer c) 
	{
		return service.register(c);
	}

}
