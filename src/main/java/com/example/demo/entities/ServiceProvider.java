package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ServiceProvider 
{
	@Id
	@GeneratedValue
	int serviceproviderid;
	
	@Column
	String name;
	@Column	
	String address;
	@Column
	String email;
	@Column
	String phone;
	@Column
	String date_recorded;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="loginid",referencedColumnName = "loginid")
	Login loginid;

	public ServiceProvider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceProvider(String name, String address, String email, String phone, String date_recorded,
			Login loginid) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.date_recorded = date_recorded;
		this.loginid = loginid;
	}
	

	public ServiceProvider(int serviceproviderid, String name, String address, String email, String phone,
			String date_recorded, Login loginid) {
		super();
		this.serviceproviderid = serviceproviderid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.date_recorded = date_recorded;
		this.loginid = loginid;
	}

	public int getServiceproviderid() {
		return serviceproviderid;
	}

	public void setServiceproviderid(int serviceproviderid) {
		this.serviceproviderid = serviceproviderid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDate_recorded() {
		return date_recorded;
	}

	public void setDate_recorded(String date_recorded) {
		this.date_recorded = date_recorded;
	}

	public Login getLoginid() {
		return loginid;
	}

	public void setLoginid(Login loginid) {
		this.loginid = loginid;
	}

	@Override
	public String toString() {
		return "ServiceProvider [serviceproviderid=" + serviceproviderid + ", name=" + name + ", address=" + address
				+ ", email=" + email + ", phone=" + phone + ", date_recorded=" + date_recorded + ", loginid=" + loginid
				+ "]";
	}
	
	
}
