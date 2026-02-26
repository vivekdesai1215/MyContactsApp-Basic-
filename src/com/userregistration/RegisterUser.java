package com.userregistration;

import main.Main;
import validator.EmailValidator;
import validator.NameValidator;
import java.util.*;

public class RegisterUser {
	
	public static User getUserData() {
		UserType userType=null;
		String name=null;
		String email=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Create your account : ");
		
		System.out.println("Type of Account : (Premium | Free)");
			String type = sc.next();
		if(type.equalsIgnoreCase("premium")) {
			 userType = UserType.PREMIUM;
		}else if(type.equalsIgnoreCase("free")){
			 userType = UserType.FREE;
		}else {
			System.out.println("Please select from the above options ");
			Main.main(new String[] {});
		}
		
		System.out.print("Enter your name : ");
		String tempName = sc.next();
		if(NameValidator.validateName(tempName)) {
			name = tempName;
		}else {
			System.out.println("Please Provide name within 10 characters ");
			Main.main(new String[] {});
		}
		
		System.out.print("Enter your email : ");
		
		String tempEmail = sc.next();
		
		if(EmailValidator.validateEmail(tempEmail)) {
			email = tempEmail;
		}else {
			System.out.println("Please Provide a valid email id ");
			Main.main(new String[] {});
		}
		
		
		System.out.print("Enter the Password : ");
		String password = HashPassword.hashPassword(sc.next());
		
		return new User(userType, name, email, password);
	}
}
