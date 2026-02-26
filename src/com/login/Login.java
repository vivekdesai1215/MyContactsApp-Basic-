package com.login;
import java.util.*;

import com.authentication.Authentication;
import com.authentication.BasicAuth;
import com.authentication.OAuth;
import com.userregistration.User;


public class Login {
	public static User login(Scanner sc) {
				
		System.out.print("Enter Email : ");
		String email = sc.nextLine();
		
		System.out.print("Enter your password : ");
		String password = sc.nextLine();
		
		System.out.println("Login Type : ");
		System.out.print("1. Basic ||  2. OAuth : ");
		int choice = sc.nextInt();
		
		Authentication auth;
		
		if(choice ==1) {
			auth = new BasicAuth();
		}
		else{
			auth = new OAuth();
		}
		
		return auth.authenticate(email, password);
			
	}
}
