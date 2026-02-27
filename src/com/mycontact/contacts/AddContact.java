
// This is responsible for Adding a new Contact to the user contact list

package com.mycontact.contacts;
import java.util.*;

import com.userregistration.User;

import main.Main;
import validator.NameValidator;

public class AddContact {
	public static void addContact(User user,Scanner sc) {
		
			String name=null;
			String phoneNo=null;
			String email=null;
			String tag=null;
			
			// We can put data validation here
			System.out.println("");
			System.out.println("Please Enter the Details of the contact to add ");
			System.out.print("Name : ");
			name = sc.nextLine();
			
			System.out.print("Phone No : ");
			phoneNo = sc.nextLine();
			
			System.out.print("Email : ");
			email = sc.nextLine();
			
			System.out.print("any Tags : ");
			email = sc.nextLine();
			
			Contacts contact = new Contacts(name,phoneNo,email,tag);
			
			List list = Main.userContacts.get(user);
			list.add(contact);
			
			Main.userContacts.put(user, list);
			
		
	}
}
