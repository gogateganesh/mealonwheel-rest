package com.example.demo.bodyobj;

public class ServiceProviderRegistration 
{
	String password;
	String email;

	String name;
	String date_recorded;
	String address;
	String phone;
	public ServiceProviderRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceProviderRegistration(String password, String email, String role, String name, String date_recorded,
			String address, String phone) {
		super();
		this.password = password;
		this.email = email;
		this.name = name;
		this.date_recorded = date_recorded;
		this.address = address;
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate_recorded() {
		return date_recorded;
	}
	public void setDate_recorded(String date_recorded) {
		this.date_recorded = date_recorded;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	

}
