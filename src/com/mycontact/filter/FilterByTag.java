package com.mycontact.filter;
import java.util.*;
import com.mycontact.contacts.Contacts;
import com.mycontact.contacts.Tag;

public class FilterByTag implements Filter{
	public static void filter(List<Contacts> contacts,Scanner sc) {
		System.out.println("");
		System.out.print("Please Select the tag to filter with :\n 1. BUSINESS \n 2. FRIEND \n 3. FAMILY \n : ");
		int choice  = sc.nextInt();
		sc.nextLine();
		if(choice ==1 ) {
			filterByTag(contacts,Tag.BUSINESS);
		}else if(choice ==2) {
			filterByTag(contacts, Tag.FRIEND);
		}else if(choice ==3){
			filterByTag(contacts, Tag.FAMILY);
		}else {
			System.out.println("Please select a valid Tag");
		}
		
	}
	public static void filterByTag(List<Contacts> contacts, Tag tag) {
		int count=1;
		for(Contacts contact : contacts) {
			if(contact.getTag().equals(tag)) {
				System.out.println(count+". Name : "+contact.getName()+", Email : "+contact.getEmail()+", PhoneNo : "+contact.getPhoneNo()+", Tag : "+contact.getTag());
				System.out.println("");
				count++;
			}
		}

		if(count==1) {
			System.out.println("Sorry No contacts found !! ");
		}
	}
}
