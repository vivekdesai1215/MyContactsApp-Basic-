
// It stores the users in a userList
// IT has a static block that initializes 2 objects initially (just for testing purpose coz we don't have any database)

//// Flow of Application : 
//Asks User if he wants to Register or Login
//If user chooses register it calls the Register method else it calls Login method
//if User successfully logs in, then it gives user options to view his profile, edit his profile data, view contact list or edit contact list


// @Author Vivek
// @version 3


package main;

import java.util.*;
import com.login.Login;
import com.mycontact.modify.ModifyUserProfile;
import com.userregistration.HashPassword;
import com.userregistration.RegisterUser;
import com.userregistration.User;
import com.userregistration.UserType;


public class Main {
	public static List<User> userList = new ArrayList<>();
	
	static {
		userList.add( new User(UserType.PREMIUM, "Vivek","vivekdesai1215@gmail.com",HashPassword.hashPassword("vivek1010"), "9190909090"));
		userList.add(new User(UserType.FREE, "Vivek","vivekdesai1215@gmail.com",HashPassword.hashPassword("vivek1010"), "7204760809")) ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to My Application");	
		
		User user=null;
		
		System.out.print("Login || SignUp ? : ");
		String choice = sc.nextLine();
		if(choice.equalsIgnoreCase("signup")) {
			user = RegisterUser.getUserData(sc);
			userList.add(user);
		}else if(choice.equalsIgnoreCase("login")) {
			System.out.println("Reached the Login if else block ");
			user = Login.login(sc);
			if(user!=null) {
				System.out.println("Login was successful !!");
			}else {
				System.out.println("Login Failed ");
			}
		}
		
		
		if(user !=null) {
			System.out.println("Subscription type : "+user.getUsertype()+" | Name : "+user.getName()+" | Email : "+user.getEmail()+" | Password : "+user.getPassword());

		}
		if(user !=null) {
		System.out.println("");
		System.out.println("Please select the Opration you wanna perform : ");
		System.out.println("1. Edit Your Profile Info \n 2. Edit Contacts ");
		int op = sc.nextInt();
		
		switch(op) {
		case 1 : {
			ModifyUserProfile.modifyUserData(user, sc);
			break;
		}
		
		
		}
		}
	}

}
