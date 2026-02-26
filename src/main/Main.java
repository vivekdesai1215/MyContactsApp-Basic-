package main;

import java.util.*;

import com.login.Login;
import com.userregistration.HashPassword;
import com.userregistration.RegisterUser;
import com.userregistration.User;
import com.userregistration.UserType;

public class Main {
	
	public static List<User> userList = new ArrayList<>();
	
	static {
		userList.add( new User(UserType.PREMIUM, "Vivek","vivekdesai1215@gmail.com",HashPassword.hashPassword("vivek1010")));
		userList.add(new User(UserType.FREE, "Vivek","vivekdesai1215@gmail.com",HashPassword.hashPassword("vivek1010"))) ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to My Application");	
		
		String name = null;
		String email = null;
		String password=null;
		UserType userType = null;
		
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
		
		
		if(user !=null) System.out.println("Subscription type : "+user.getUsertype()+" | Name : "+user.getName()+" | Email : "+user.getEmail()+" | Password : "+user.getPassword());
		
		
		
	}

}
