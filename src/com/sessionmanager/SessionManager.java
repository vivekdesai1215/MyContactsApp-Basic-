package com.sessionmanager;
import java.util.*;
import com.userregistration.User;



public class SessionManager {
	private static SessionManager instance;
	
	public Map<String, User> getSessions() {
		return sessions;
	}

	public void setSessions(Map<String, User> sessions) {
		this.sessions = sessions;
	}
	

	private Map<String, User> sessions = new HashMap<>();
	
	
	private SessionManager() {};
	
	public static SessionManager startSession() {
		if(instance==null) {
			instance =new SessionManager();
		}
		
		return instance;
	}
	
	public void endSession() {
		instance = null;
	}
	
	public void createSession(String token, User user) {
		sessions.put(token, user);
	}
	
	public boolean isValidSession(String token) {
		return sessions.containsKey(token);
	}
}