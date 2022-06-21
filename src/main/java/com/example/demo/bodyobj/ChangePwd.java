package com.example.demo.bodyobj;

public class ChangePwd 
{
	String username;
	String oldpassword;
	String newpassword;
	
	public ChangePwd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChangePwd(String username, String oldpassword, String newpassword) {
		super();
		this.username = username;
		this.oldpassword = oldpassword;
		this.newpassword = newpassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOldpassword() {
		return oldpassword;
	}
	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	@Override
	public String toString() {
		return "ChangePwd [username=" + username + ", oldpassword=" + oldpassword + ", newpassword=" + newpassword
				+ "]";
	}

}
