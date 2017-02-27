package com.sgs.vision.common.exceptions;

public class DuplicatedUserException extends Exception{

	private static final long serialVersionUID = 1513577654524037595L;

	private String username;
	
	public DuplicatedUserException(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
