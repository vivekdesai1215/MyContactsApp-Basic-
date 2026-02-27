

// This class is responsible for User Profile Modifications
// It asks the fields the user wants to edit and then validates them and edits the user profile data.

package com.mycontact.modify;
import java.util.Scanner;

import com.userregistration.User;

import validator.EmailValidator;
import validator.NameValidator;
import validator.PhoneNoValidator;

public class ModifyUserProfile {
	public static void modifyUserData(User user, Scanner sc) {

		boolean end = false;
		do {
			System.out.println("");
			System.out.println("--------------------------------------");
			System.out.println("Please select the field you want to edit : ");
			System.out.println("1. Your Name \n 2. Your Email \n 3. Your Password \n 4. Your Phone No \n 5. Exit Profile Edit");
			String option = sc.nextLine();
			switch(option) {
			case "1": {
				System.out.println("Enter the new Name : ");
				String newName = sc.nextLine();
				if(NameValidator.validateName(newName)) {
					user.setName(newName);
					System.out.println("Updated the Name Successfully !!");
				}
				else {
					System.out.println("Please enter a proper name !!");
				}
				break;
			}
			case "2":{
				System.out.println("Enter the new Email : ");
				String newEmail = sc.nextLine();
				if(EmailValidator.validateEmail(newEmail)) {
					user.setName(newEmail);
					System.out.println("Updated the Email Successfully !!");
				}
				else {
					System.out.println("That is not a valid email !!");
				}
				break;
			}
			case "3":{
				System.out.println("Enter the new Password : ");
				String newPassword = sc.nextLine();
				
				// Can also ask the user to provide his old password and verify it and then allow the user to update his password.
				user.setPassword(newPassword);
				System.out.println("Updated the password successfully !!");
				break;
			}
			case "4" :{
				System.out.println("Enter the new Phone No : ");
				String newPh = sc.nextLine();
				if(PhoneNoValidator.validatePhoneNo(newPh)) {
					user.setPhoneNo(newPh);
					System.out.println("Updated the Phone No Successfully !!");
				}else {
					System.out.println("The Entered phone No is invalid ");
				}
				break;
			}
			case "5":{
				return;
			}
			default : {
				System.out.println("Enter a valid option ");
				break;
			}
			}

		}while(!end);
		return;
		
		
	}
}
