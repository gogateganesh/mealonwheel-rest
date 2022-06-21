package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue
	int custid;
	
	@Column
	String name;
	@Column
	String address;
	@Column
	String email;
	@Column
	String phone;
	@Column
	String birthdate;
	@Column
	int loginid;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custid, String name, String address, String email, String phone, String birthdate,
			int loginid) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.birthdate = birthdate;
		this.loginid = loginid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
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
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", phone=" + phone + ", birthdate=" + birthdate + ", loginid=" + loginid + "]";
	}

}
