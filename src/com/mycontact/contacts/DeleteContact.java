package com.mycontact.contacts;
import java.util.*;


public class DeleteContact {
	public static void deleteContacts(List<Contacts> contacts,Scanner sc) {
		System.out.println("");
		System.out.println("Your Contacts are : ");
		ViewContacts.viewContacts(contacts);
		System.out.println("");
		System.out.println("Enter the Contact that you want to Delete :");
		int choice = sc.nextInt();
		sc.nextLine();
		contacts.remove(choice-1);
		
		do {
			System.out.println("Your Contacts are : ");
			ViewContacts.viewContacts(contacts);
			System.out.println("");
			System.out.println("Delete Another contact ? - choose one - ");
			System.out.println("If you want to exit deleting contacts then type '0' ");
			int ch = sc.nextInt();
			sc.nextLine();
			
			if(ch==0) {
				break;
			}else {
				contacts.remove(choice-1);
			}
			
		}while(!contacts.isEmpty());
	}	
}
