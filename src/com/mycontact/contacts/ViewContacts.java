package com.mycontact.contacts;

import java.util.*;

public class ViewContacts {
	public static void viewContacts(List<Contacts> contacts) {
		int count=1;
		
		for(Contacts contact : contacts) {
			String name = contact.getName();
			String phoneNo = contact.getPhoneNo();
			String email = contact.getEmail();
			Tag tag = contact.getTag();
			
			System.out.println("");
			System.out.println("Contact Info - "+count++);
			System.out.print("Name : "+name);
			System.out.print(" | Email : "+email);
			System.out.println(" | PhoneNo : "+phoneNo);
			System.out.println(" | tag : "+tag);
		}
	}
}
