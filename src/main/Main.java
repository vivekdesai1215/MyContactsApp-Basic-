package main;

import java.util.Scanner;

import com.userregistration.RegisterUser;
import com.userregistration.User;
import com.userregistration.UserType;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to My Application");	
		
		String name = null;
		String email = null;
		String password=null;
		UserType userType = null;
		
		
		User user = RegisterUser.getUserData();
		
		System.out.println("Subscription type : "+user.getUsertype()+" | Name : "+user.getName()+" | Email : "+user.getEmail()+" | Password : "+user.getPassword());
		
		
		
	}
}
