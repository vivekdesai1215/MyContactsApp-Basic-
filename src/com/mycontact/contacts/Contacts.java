package com.mycontact.contacts;

import java.util.*;

public class Contacts {
	
	private String name;
	String phoneNo;
	String email;
	String tag;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public  Contacts(String name, String phoneNo, String email, String tag) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.tag = tag;
	}
	
	
	
	
}
