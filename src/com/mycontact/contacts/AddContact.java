
// This is responsible for Adding a new Contact to the user contact list

package com.mycontact.contacts;
import java.util.*;
import java.time.*;

import com.userregistration.User;

import main.Main;
import validator.NameValidator;

public class AddContact {
	public static void addContact(User user,Scanner sc) {
		
			String name=null;
			String phoneNo=null;
			String email=null;
			String tags=null;
			Tag tag=null;
			LocalDate dateCreated=null;
			
			// We can put data validation here
			System.out.println("");
			System.out.println("Please Enter the Details of the contact to add ");
			System.out.print("Name : ");
			name = sc.nextLine();
			
			System.out.print("Phone No : ");
			phoneNo = sc.nextLine();
			
			System.out.print("Email : ");
			email = sc.nextLine();
			
			System.out.print("Choose any Tag : BUSINESS | FRIEND | FAMILY");
			tags = sc.nextLine();
			if(tags.equalsIgnoreCase("business"))	tag = Tag.BUSINESS;
			else if(tags.equalsIgnoreCase("family")) tag = Tag.FAMILY;
			else if(tags.equalsIgnoreCase("friend")) tag = Tag.FRIEND;
			else System.out.println("Please Enter a valid Tag ");
			
			Contacts contact = new Contacts(name,phoneNo,email, tag, LocalDate.now());
			
			List list = Main.userContacts.get(user);
			list.add(contact);
			
			Main.userContacts.put(user, list);
			
		
	}
}
