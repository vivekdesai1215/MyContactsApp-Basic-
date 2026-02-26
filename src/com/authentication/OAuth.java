package com.authentication;

import java.util.UUID;

import com.sessionmanager.SessionManager;
import com.userregistration.HashPassword;
import com.userregistration.User;

import main.Main;

public class OAuth implements Authentication{

	public User authenticate(String email, String password) {
		password = HashPassword.hashPassword(password);
		
		for(User user : Main.userList) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				
				String token = UUID.randomUUID().toString();
				SessionManager sm = SessionManager.startSession();
				sm.createSession(token, user);
				
				System.out.println("Your OAuth token is : "+token);
				return user;
			}
		}
		return null;
	}
	
	
}
