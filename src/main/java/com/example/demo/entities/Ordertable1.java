package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ordertable1 
{
	@Id
	@GeneratedValue
	int orderid;
	
	@Column
	int custid;
	
	@Column
	int spid;
	
	@Column
	String status;
	
	@Column
	int quantity;

	public Ordertable1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ordertable1(int custid, int spid, String status, int quantity) {
		super();
		this.custid = custid;
		this.spid = spid;
		this.status = status;
		this.quantity = quantity;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
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

	@Override
	public String toString() {
		return "Ordertable1 [orderid=" + orderid + ", custid=" + custid + ", spid=" + spid + ", status=" + status
				+ ", quantity=" + quantity + "]";
	}
	
	
	

}
