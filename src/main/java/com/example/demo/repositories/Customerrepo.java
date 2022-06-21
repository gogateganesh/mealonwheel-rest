package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Customer;

@Repository
public interface Customerrepo extends JpaRepository<Customer, Integer> 
{
	@Query("select c from Customer c where c.loginid = :loginid")
	public Customer getOneCustomer(int loginid);

	@Query("select c from Customer c where c.custid = :id")
	public Customer getByCustId(int id);
}
