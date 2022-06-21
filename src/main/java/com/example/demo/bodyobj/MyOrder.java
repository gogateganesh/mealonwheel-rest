package com.example.demo.bodyobj;

import com.example.demo.entities.Customer;

public class MyOrder 
{
	Customer custid;
	
	String status;
	
	int quantity;

	public MyOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyOrder(Customer custid, String status, int quantity) {
		super();
		this.custid = custid;
		this.status = status;
		this.quantity = quantity;
	}

	public Customer getCustid() {
		return custid;
	}

	public void setCustid(Customer custid) {
		this.custid = custid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
