package com.mycontact.search;
import java.util.*;
import com.userregistration.User;

import main.Main;

public class SearchContactsHandler {
	public static void searchContacts(User user,Scanner sc) {
		
		System.out.println("Please select the filed you want to search your contacts with : ");
		System.out.println(" 1. Name \n 2. Phone No \n 3. Email \n 4. Tag \n 5.Exit \n :");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:{
			System.out.print("Please Enter the name to search : ");
			String name = sc.nextLine();
			SearchByName.search(Main.userContacts.get(user), name);
			break;
		}
		case 2:{
			System.out.print("Please Enter the PhoneNo to search : ");
			String phoneNo = sc.nextLine();
			SearchByPhoneNo.search(Main.userContacts.get(user), phoneNo);
			break;
		}
		case 3:{
			System.out.print("Please Enter the Email to search : ");
			String email = sc.nextLine();
			SearchByEmail.search(Main.userContacts.get(user), email);
			break;
		}
		case 4:{
			System.out.print("Please Enter the Tag to search :(BUSINESS | FRIEND | FAMILY) ");
			String tag = sc.nextLine();
			SearchByTag.search(Main.userContacts.get(user), tag);
			break;
		}
		case 5:{
			break;
		}
		default:{
			break;
		}
		}
	}
}
