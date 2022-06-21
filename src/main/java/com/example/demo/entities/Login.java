package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Login 
{
	@Id
	@GeneratedValue
	int loginid;
	
	@Column
	String username;
	
	@Column
	String password;
	
	@Column
	String role;
	
	public Login(int loginid, String username, String password, String role) {
		super();
		this.loginid = loginid;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Login(int loginid, String role) {
		super();
		this.loginid = loginid;
		this.role = role;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Login [loginid=" + loginid + ", username=" + username + ", password=" + password + ", role=" + role
				+ "]";
	}
	
	
}
