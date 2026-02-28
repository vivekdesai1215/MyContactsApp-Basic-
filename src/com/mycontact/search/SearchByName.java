package com.mycontact.search;
import java.util.*;

import com.mycontact.contacts.Contacts;

public class SearchByName implements Search{
	
	public static void search(List<Contacts> contacts,String name) {		
		
		System.out.println("");
		System.out.println("Search Result - ");
		int count = 1;
		for(Contacts contact : contacts) {
			if(contact.getName().equalsIgnoreCase(name)) {
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

