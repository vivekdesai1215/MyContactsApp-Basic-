package com.mycontact.filter;
import java.util.*;
import com.mycontact.contacts.Contacts;

public class FilterByContactFrequency implements Filter{
	
	public static void filter(List<Contacts> contacts, Scanner sc) {
		System.out.println("");
		System.out.print("Filter the contacts by : \n(1. Contacted mora than X times) \n(2. Contacted less than X times) \n : ");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Frequency : ");
		int frequency = sc.nextInt();
		sc.nextLine();
		
		if(choice ==1) {
			filterByFreq(contacts,frequency,true);
		}else {
			filterByFreq(contacts,frequency,false);
		}
	}
	public static void filterByFreq(List<Contacts> contacts, int frequency ,boolean moreThan) {
		int count=1;
		if(moreThan) {
			for(Contacts contact : contacts) {
				if(contact.getContactFrequency() > frequency) {
					System.out.println(count+". Name : "+contact.getName()+", Email : "+contact.getEmail()+", PhoneNo : "+contact.getPhoneNo()+", Tag : "+contact.getTag());
					System.out.println("");
					count++;
				}
			} 
		}
		else {
			for(Contacts contact : contacts) {
				if(contact.getContactFrequency() < frequency) {
					System.out.println(count+". Name : "+contact.getName()+", Email : "+contact.getEmail()+", PhoneNo : "+contact.getPhoneNo()+", Tag : "+contact.getTag());
					System.out.println("");
					count++;
				}
			}
		}
		
		if(count==1) {
			System.out.println("Sorry No contacts found : ");
		}
	}
}
