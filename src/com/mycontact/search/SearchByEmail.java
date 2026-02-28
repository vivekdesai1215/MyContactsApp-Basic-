package com.mycontact.search;

import java.util.List;

import com.mycontact.contacts.Contacts;

public class SearchByEmail implements Search{
	
public static void search(List<Contacts> contacts,String email) {		
		
		System.out.println("");
		System.out.println("Search Result - ");
		int count = 1;
		for(Contacts contact : contacts) {
			if(contact.getEmail().equalsIgnoreCase(email)) {
				System.out.print(count+". Name : "+contact.getName()+" | Email : "+contact.getEmail()+" | Phone : "+contact.getPhoneNo()+" | Tag : "+contact.getTag());
				count++;
			}
		}
		if(count==1) {
			System.out.println("No Results Found ");
		}
		System.out.println("");
	}
}
