package com.userregistration;

public class User {
	private UserType usertype;
	private String name;
	private String email;
	private String password;
	
	
	public User(UserType usertype, String name, String email, String password) {
		this.usertype = usertype;
		this.name = name;
		this.email = email;
		this.password = password;
		
		System.out.println("User object successfully created !!");
	}
	
	public UserType getUsertype() {
		return usertype;
	}

	public void setUsertype(UserType usertype) {
		this.usertype = usertype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	
	
}
