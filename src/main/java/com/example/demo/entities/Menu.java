package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Menu 
{
	@Id
	@GeneratedValue
	int menuid;
	@Column
	String name;
	@Column
	String description;
	@Column
	
	double price;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="spid",referencedColumnName = "serviceproviderid")
	ServiceProvider spid;

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(String name, String description, double price, ServiceProvider spid) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.spid = spid;
	}

	public Menu(int menuid, String name, String description, double price, ServiceProvider spid) {
		super();
		this.menuid = menuid;
		this.name = name;
		this.description = description;
		this.price = price;
		this.spid = spid;
	}

	public int getMenuid() {
		return menuid;
	}

	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ServiceProvider getSpid() {
		return spid;
	}

	public void setSpid(ServiceProvider spid) {
		this.spid = spid;
	}
	
}
