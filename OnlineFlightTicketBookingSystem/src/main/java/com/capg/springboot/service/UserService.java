package com.capg.springboot.service;

import com.capg.springboot.entity.User;

public interface UserService 
{
	
	 User addUser(User customer);
	  
	  User updateUser(User customer);
	  
	  User removeUser(User customer);	 
	
}