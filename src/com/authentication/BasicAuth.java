//This is Basic Auth , it just takes user email and password and password and compares with the existing users in userList and
//if they both match then it returns user Object

package com.authentication;

import main.Main;

import com.userregistration.HashPassword;
import com.userregistration.User;

public class BasicAuth implements Authentication{
	
	public User authenticate(String email,String password) {
		password = HashPassword.hashPassword(password);
		
		for(User user : Main.userList) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
	
}
