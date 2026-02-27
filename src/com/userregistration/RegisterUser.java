package com.userregistration;

import main.Main;
import validator.EmailValidator;
import validator.NameValidator;
import validator.PhoneNoValidator;

import java.util.*;

public class RegisterUser {
	
	public static User getUserData(Scanner sc) {
		UserType userType=null;
		String name=null;
		String email=null;
		String phoneNo=null;
		
		System.out.println("Create your account : ");
		
		System.out.println("Type of Account : (Premium | Free)");
			String type = sc.nextLine();
		if(type.equalsIgnoreCase("premium")) {
			 userType = UserType.PREMIUM;
		}else if(type.equalsIgnoreCase("free")){
			 userType = UserType.FREE;
		}else {
			System.out.println("Please select from the above options ");
			Main.main(new String[] {});
		}
		
		System.out.print("Enter your name : ");
		String tempName = sc.nextLine();
		if(NameValidator.validateName(tempName)) {
			name = tempName;
		}else {
			System.out.println("Please Provide name within 10 characters ");
			Main.main(new String[] {});
		}
		
		System.out.print("Enter your email : ");
		
		String tempEmail = sc.nextLine();
		
		if(EmailValidator.validateEmail(tempEmail)) {
			email = tempEmail;
		}else {
			System.out.println("Please Provide a valid email id ");
			Main.main(new String[] {});
		}
		
		
		System.out.print("Enter the Password : ");
		String password = HashPassword.hashPassword(sc.nextLine());
		
		System.out.print("Please Enter the PhoneNo : ");
		String tempPhNo = sc.nextLine();
		if(PhoneNoValidator.validatePhoneNo(tempPhNo)) {
			phoneNo = tempPhNo;
		}else {
			System.out.println("Please Provide a valid Phone No!! ");
			Main.main(new String[] {});
		}
		
		return new User(userType, name, email, password, phoneNo);
	}
}
