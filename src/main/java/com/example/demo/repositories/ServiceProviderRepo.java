package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;
import com.example.demo.entities.ServiceProvider;


@Repository
public interface ServiceProviderRepo extends JpaRepository<ServiceProvider, Integer> 
{
	@Query("select sp from ServiceProvider sp where sp.loginid = :loginid")
	public ServiceProvider getOneSP(Login loginid);

}
