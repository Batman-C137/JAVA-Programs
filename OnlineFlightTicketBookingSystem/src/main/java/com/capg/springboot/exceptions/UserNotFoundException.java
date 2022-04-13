package com.capg.springboot.exceptions;

public class UserNotFoundException extends Exception 
{
	public UserNotFoundException(String s) {
		super(s);
	}
}