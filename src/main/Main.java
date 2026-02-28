
// Extending UC7 and implementing this
// Converted the Tag into an Enum field so that I can add more type of tags if I want and Can enforce the user into choosing a consistent tag
// Which will be helpful for futher operations like filtering and all


// @Author Vivek
// @version 8


package main;

import java.util.*;
import com.login.Login;
import com.mycontact.contacts.AddContact;
import com.mycontact.contacts.Contacts;
import com.mycontact.contacts.DeleteContact;
import com.mycontact.contacts.EditContacts;
import com.mycontact.contacts.Tag;
import com.mycontact.contacts.ViewContacts;
import com.mycontact.modify.ModifyUserProfile;
import com.mycontact.search.SearchContactsHandler;
import com.sessionmanager.SessionManager;
import com.userregistration.HashPassword;
import com.userregistration.RegisterUser;
import com.userregistration.User;
import com.userregistration.UserType;


@SuppressWarnings("unused")
public class Main {
	public static List<User> userList = new ArrayList<>();
	public static Map<User, List<Contacts>> userContacts = new HashMap<>();
	
	
	static {
		User user01 = new User(UserType.PREMIUM, "Vivek","vivekdesai1215@gmail.com",HashPassword.hashPassword("vivek1010"), "9190909090");
		User user02 = new User(UserType.FREE, "Vivek","vivekdesai1215@gmail.com",HashPassword.hashPassword("vivek1010"), "7204760809");
		userList.add(user01);
		userList.add(user02);
		Contacts contacts01 = new Contacts( "tempo", "9191919191","shreyas@gmail.com",Tag.FAMILY);
		Contacts contacts02 = new Contacts("tempooooo","7204760809","hey@gmail.com",Tag.FRIEND);
		userContacts.put(user01, new ArrayList<>(Arrays.asList(contacts01,contacts02)));
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to My Application");	
		
		User user = null;
		
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
			do {
			System.out.println("");
			System.out.println("Please select the Opration you wanna perform : ");
			System.out.println("1. View your Profile Info \n 2. Edit Your Profile Info \n 3. View your Contacts \n 4. Add Contacts \n 5. Edit your Contacts \n 6. Delete Contacts \n 7. Search Contacts \n 8. End Session(Log Out)");
			System.out.println("");
			int op = sc.nextInt();
			sc.nextLine();
		
			switch(op) {
			case 1:{
				System.out.println("Name : "+user.getName());
				System.out.println("Email : "+user.getEmail());
				System.out.println("PhoneNo : "+user.getPhoneNo());
				System.out.println("");
				break;
			}
			case 2 : {
				ModifyUserProfile.modifyUserData(user, sc);
				break;
			}
			case 3:{
				ViewContacts.viewContacts(userContacts.get(user));
				break;
			}
			case 4:{
				AddContact.addContact(user, sc);
				break;
			}
			case 5:{
				EditContacts.editContacts(userContacts.get(user), sc);
				break;
			}
			case 6:{
				DeleteContact.deleteContacts(userContacts.get(user), sc);
				break;
			}
			case 7:{
				SearchContactsHandler.searchContacts(user, sc);
				break;
			}
			case 8:{
				
				break;
			}
		}
		}while(true);
		}
	}

}
