package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.Customerrepo;
import com.example.demo.repositories.OrdertableRepo;
import com.example.demo.bodyobj.MyOrder;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Ordertable1;

@Service
public class OrdertableService 
{
	@Autowired
	OrdertableRepo ordertableRepo;
	
	@Autowired
	Customerrepo customerrepo;
	
	public List<MyOrder> getorderbyspid(int spid)
	{	
		List<Ordertable1> sorted = new ArrayList<>();
		List<Ordertable1> all = ordertableRepo.findAll();
		for (Ordertable1 order : all) {
			if(order.getSpid() == spid)
			{
				sorted.add(order);
			}
		}
		List<MyOrder> allorders = new ArrayList<>();
		for (Ordertable1 o : sorted) {
			Customer c = customerrepo.getByCustId(o.getCustid());
			MyOrder order = new MyOrder(c,o.getStatus(),o.getQuantity());
			allorders.add(order);
		}
		
		return allorders;
	}
	
	public Ordertable1 placeorder(Ordertable1 order)
	{
		return ordertableRepo.save(order);
	}

}

