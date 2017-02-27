package com.sgs.vision.common.exceptions;

public class KeyStoreException extends Exception{

	private static final long serialVersionUID = -5840016456968612196L;
	
	private String message;
	
	public KeyStoreException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
