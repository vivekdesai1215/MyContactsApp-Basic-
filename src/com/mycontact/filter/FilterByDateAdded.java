package com.mycontact.filter;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import com.mycontact.contacts.Contacts;

public class FilterByDateAdded implements Filter{
	public static void filter(List<Contacts> contacts,Scanner sc) {
		
		System.out.println("");
		System.out.println("Filter by : ");
		System.out.println(" 1. Contact added before X date \n 2. Contact added after X date \n 3. Contact added On Date X ");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter a date (dd-MM-yyyy): "); String input = sc.nextLine(); 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		LocalDate date = LocalDate.parse(input, formatter);
		
		if(choice==1) {
			filterBeforeDate(contacts,date);
		}else if(choice ==2) {
			filterAfterDate(contacts,date);
		}else if(choice ==3) {
			filterOnDate(contacts,date);
		}else System.out.println("Please enter a valid choice ");
		
	}
	
	private static void filterBeforeDate(List<Contacts> contacts,LocalDate date) {
		int count = 1;
		for(Contacts contact : contacts) {
			if(contact.getDateCreated().isBefore(date)) {
				System.out.println(count+". Name : "+contact.getName()+", Email : "+contact.getEmail()+", PhoneNo : "+contact.getPhoneNo()+", Tag : "+contact.getTag());
				System.out.println("");
				count++;
			}
		}
		
		if(count==1) {
			System.out.println("Sorry No contacts found before date : "+date);
		}
	}
	
	private static void filterAfterDate(List<Contacts> contacts,LocalDate date) {
		int count = 1;
		for(Contacts contact : contacts) {
			if(contact.getDateCreated().isAfter(date)) {
				System.out.println(count+". Name : "+contact.getName()+", Email : "+contact.getEmail()+", PhoneNo : "+contact.getPhoneNo()+", Tag : "+contact.getTag());
				System.out.println("");
				count++;
			}
		}
		
		if(count==1) {
			System.out.println("Sorry No contacts found after date : "+date);
		
		}
	}
	
	private static void filterOnDate(List<Contacts> contacts,LocalDate date) {
		int count = 1;
		for(Contacts contact : contacts) {
			if(contact.getDateCreated().isEqual(date)) {
				System.out.println(count+". Name : "+contact.getName()+", Email : "+contact.getEmail()+", PhoneNo : "+contact.getPhoneNo()+", Tag : "+contact.getTag());
				System.out.println("");
				count++;
			}
		}
		
		if(count==1) {
			System.out.println("Sorry No contacts found after date : "+date);
		
	}
	}
	
	
	}
