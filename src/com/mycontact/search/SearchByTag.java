package com.mycontact.search;

import java.util.List;

import com.mycontact.contacts.Contacts;
import com.mycontact.contacts.Tag;

public class SearchByTag implements Search {
	
public static void search(List<Contacts> contacts,String tag) {		
		
		System.out.println("");
		System.out.println("Search Result - ");
		int count = 1;
		Tag currentTag=null;
		
		if(tag.equalsIgnoreCase("business")) {
			currentTag =Tag.BUSINESS;
		}else if(tag.equalsIgnoreCase("friend")) {
			currentTag = Tag.FRIEND;
		}else if(tag.equalsIgnoreCase("friend")) {
			currentTag = Tag.FRIEND;
		}
			
		for(Contacts contact : contacts) {
			if(contact.getTag().equals(currentTag)) {
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
