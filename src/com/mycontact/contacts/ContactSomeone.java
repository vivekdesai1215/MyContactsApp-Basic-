package com.mycontact.contacts;
import java.util.*;


public class ContactSomeone {
	public static void contactSomeone(List<Contacts> contacts,Scanner sc) {
		System.out.println("");
		System.out.println("Please select from the below Contacts to Contact");
		System.out.println("");
		ViewContacts.viewContacts(contacts);
		System.out.println("");
		
		System.out.print("Enter the contact index : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		contacts.get(choice-1).setContactFrequency(contacts.get(choice-1).getContactFrequency() +1);
		System.out.println("Contacting "+contacts.get(choice-1).getName()+".........");
		System.out.println("Successfully Contacted ");
		System.out.println(" ");
	}
}
