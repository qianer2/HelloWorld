package com.google.user;

public class User {
	private String username;
	private String userpassword;

	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public User(String username) {
		super();
		this.username = username;
	}



	public User(String username, String userpassword) {
		super();
		this.username = username;
		this.userpassword = userpassword;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
}
