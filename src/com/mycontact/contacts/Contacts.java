package com.mycontact.contacts;
import java.time.*;
import java.util.*;

public class Contacts {
	
	private String name;
	private String phoneNo;
	private String email;
	private Tag tag;
	private LocalDate dateCreated;
	private int contactFrequency;
	
	
	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public int getContactFrequency() {
		return contactFrequency;
	}

	public void setContactFrequency(int contactFrequency) {
		this.contactFrequency = contactFrequency;
	}

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
	public Tag getTag() {
		return tag;
	}
	
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
	public  Contacts(String name, String phoneNo, String email, Tag tag,LocalDate dateCreated) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.tag = tag;
		this.dateCreated = dateCreated;
	}
	
	
	
	
	
}
