package com.mycontact.contacts;
import java.util.*;

import com.mycontact.filter.FilterContactsHandler;
import com.mycontact.search.SearchContactsHandler;
import com.userregistration.User;

import main.Main;

public class ContactMenu {
	
	public static void contactMenu(User user,Scanner sc) {
		System.out.println("Welcome to the Contacts Menu ");
		System.out.println("");
		boolean end = false;
		
		while(!end) {
			System.out.println("Please select the Opration you wanna perform : ");
			System.out.println(" 1. Contact Someone ? \n 2. 8View your Contacts \n 3. Add Contacts \n 4. Edit your Contacts \n 5. Delete Contacts \n 6. Search Contacts \n 7.Filter Contacts \n 8. End Session(Log Out)");
			System.out.println("");
			int op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
			case 1:{
				ContactSomeone.contactSomeone(Main.userContacts.get(user), sc);
				break;
			}
			case 2:{
				ViewContacts.viewContacts(Main.userContacts.get(user));
				break;
			}
			case 3:{
				AddContact.addContact(user, sc);
				break;
			}
			case 4:{
				EditContacts.editContacts(Main.userContacts.get(user), sc);
				break;
			}
			case 5:{
				DeleteContact.deleteContacts(Main.userContacts.get(user), sc);
				break;
			}
			case 6:{
				SearchContactsHandler.searchContacts(user, sc);
				break;
			}
			case 7:{
				FilterContactsHandler.filterContactsHandler(Main.userContacts.get(user),sc);
			}
			case 8:{
				end = true;
				break;
				
			}
			}
			
		}
		
		
		
	}
	
	
}
