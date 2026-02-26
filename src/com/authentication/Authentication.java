package com.authentication;
import com.userregistration.User;
import com.userregistration.UserType;

public interface Authentication {
	public User authenticate(String email,String password);
}
