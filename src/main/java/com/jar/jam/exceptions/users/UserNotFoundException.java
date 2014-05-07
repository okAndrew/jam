package com.jar.jam.exceptions.users;

import com.jar.jam.exceptions.JamException;

public class UserNotFoundException extends JamException {

	private static final long serialVersionUID = 5250152854516284414L;
	
	public UserNotFoundException(String arg1) {
		super("User is not found with this credentials: " + arg1);
	}

}
