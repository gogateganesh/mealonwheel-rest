package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ServiceProvider;
import com.example.demo.repositories.ServiceProviderRepo;

@Service
public class ServiceProviderService 
{
	@Autowired
	ServiceProviderRepo serviceProviderRepo;
	
	public ServiceProvider add(ServiceProvider serviceProvider)
	{
		return serviceProviderRepo.save(serviceProvider); //inserts record in the service provider table
	}
	
}
