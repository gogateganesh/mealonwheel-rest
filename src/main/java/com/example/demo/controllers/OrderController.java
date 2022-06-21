package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bodyobj.MyOrder;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Ordertable1;
import com.example.demo.repositories.Customerrepo;
import com.example.demo.services.CustomerService;
import com.example.demo.services.OrdertableService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:80"})
public class OrderController {
	
	@Autowired
	OrdertableService ordertableService;
	
	@Autowired
	CustomerService customerService;
	
	
	@GetMapping("/getmyorders/{spid}")
	public List<MyOrder> getOneMenu(@PathVariable(value="spid")int spid)
	{
		return ordertableService.getorderbyspid(spid);
	}

	@PostMapping("/placeorder") //to place order by user
	public Ordertable1 addmenu(@RequestBody Ordertable1 order) 
	{
		return ordertableService.placeorder(order);
	}
	
//	@GetMapping("/delivered/{orderid}")
//	public String statuschange(@PathVariable(value="spid")int orderid)
//	{
//		
//	}

	
	
}
