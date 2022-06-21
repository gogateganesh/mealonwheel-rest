package com.example.demo.bodyobj;


public class addmenu 
{
	int serviceProvider;
	
	String name;
	
	double price;
	
	String description;

	public addmenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public addmenu(int serviceProvider, String name, double price, String description) {
		super();
		this.serviceProvider = serviceProvider;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public int getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(int serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
