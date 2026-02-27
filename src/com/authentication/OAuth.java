//This is OAuth, it works a bit complex
// It first verifies the user email id and password
// It then generates a random token using UUID.randomUUID()
// It then calls the SessionManager to start a session, which creates a session and stores the session in HashMap along with the token
// Then it returns the user object

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
