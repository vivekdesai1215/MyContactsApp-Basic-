
// This class is responsible for Editing the contacts information
// First It displays the available contacts and asks the user to select one
// then takes that object from the list and updates and pushes it back


package com.mycontact.contacts;
import java.util.*;
import com.userregistration.User;


public class EditContacts {
	
	public static void editContacts(List<Contacts> contacts, Scanner sc) {
		
		System.out.println("Your Contacts are : ");
		ViewContacts.viewContacts(contacts);
		System.out.println("");
		System.out.println("Enter the Contact that you want to edit :");
		int choice = sc.nextInt();
		sc.nextLine();
		
		Contacts contact = contacts.get(choice-1);
		contacts.remove(choice-1);
		
		boolean end = false;
		do {
			System.out.println("What do you want to edit ? ");
			System.out.println("1. Name \n 2. Email \n 3. Phone No \n 4. Tag \n 5. Exit \n : ");
			int option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 1:{
				System.out.print("Enter the updated Name : ");
				String name = sc.nextLine();
				contact.setName(name);
				break;
			}
			case 2:{
				System.out.print("Enter the updated Email : ");
				String email = sc.nextLine();
				contact.setEmail(email);
				break;
			}
			case 3:{
				System.out.print("Enter the updated PhoneNo : ");
				String phoneNo = sc.nextLine();
				contact.setPhoneNo(phoneNo);
				break;
			}
			case 4:{
				System.out.print("Change the Tag ? ");
				System.out.println("Choose One of these : BUSINESS | FRIEND | FAMILY ");
				String tag = sc.nextLine();
				if(tag.equalsIgnoreCase("business")) contact.setTag(Tag.BUSINESS);
				else if(tag.equalsIgnoreCase("family")) contact.setTag(Tag.FAMILY);
				else if(tag.equalsIgnoreCase("friend")) contact.setTag(Tag.FRIEND);
				else System.out.println("Please Enter a valid Tag ");
				break;
			}
			case 5 :{
				end = true;
				break;
			}
			default :{
				end = true;
				break;
			}
			}
		}while(!end);
		
		contacts.add(contact);
		
	}
}
