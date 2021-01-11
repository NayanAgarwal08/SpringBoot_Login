package com.zensar.bean;

public class UserBean {
	
	private String userName;
	private String pass;
	
	public UserBean() {
		
	}
	public UserBean(String userName, String pass) {
		super();
		this.userName = userName;
		this.pass = pass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "UserBean [userName=" + userName + ", pass=" + pass + "]";
	}
	
	

}
