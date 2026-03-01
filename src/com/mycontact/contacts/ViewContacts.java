package com.mycontact.contacts;

import java.time.LocalDate;
import java.util.*;

public class ViewContacts {
	public static void viewContacts(List<Contacts> contacts) {
		int count=1;
		
		for(Contacts contact : contacts) {
			String name = contact.getName();
			String phoneNo = contact.getPhoneNo();
			String email = contact.getEmail();
			Tag tag = contact.getTag();
			LocalDate dateCreated =contact.getDateCreated();
			
			System.out.println("");
			System.out.println("Contact Index - "+count++);
			System.out.print("Name : "+name);
			System.out.print(" | Email : "+email);
			System.out.print(" | PhoneNo : "+phoneNo);
			System.out.print(" | tag : "+tag);
			System.out.print(" | Date Created : "+dateCreated);
			System.out.println("");
		}
	}
}