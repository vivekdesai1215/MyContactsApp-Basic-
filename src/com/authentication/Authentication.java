package com.authentication;
import com.userregistration.User;

// This is Authentication Interface - it basically gives a abstract method named authenticate which is implemented by its two child classes - OAuth and BasicAuth


public interface Authentication {
	public User authenticate(String email,String password);
}
