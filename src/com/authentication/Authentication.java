package com.authentication;
import com.userregistration.User;

public interface Authentication {
	public User authenticate(String email,String password);
}
