package com.mycontact.filter;
import java.util.*;
import com.mycontact.contacts.Contacts;

public class FilterContactsHandler {
	public static void filterContactsHandler(List<Contacts> contacts, Scanner sc) {
		System.out.println(" How do you want to filter your contacts ? (1. Date added) | (2. Frequently Contacted) | (3. By Tag) | (4. Exit)");
		int choice = sc.nextInt();
		
		switch(choice){
		case 1:{
			FilterByDateAdded.filter(contacts, sc);
			break;
		}
		case 2:{
			FilterByContactFrequency.filter(contacts, sc);
			break;
		}
		case 3:{
			FilterByTag.filter(contacts, sc);
			break;
		}
		case 4:{
			break;
		}
		default:{
			break;
		}
		}
	}
}
