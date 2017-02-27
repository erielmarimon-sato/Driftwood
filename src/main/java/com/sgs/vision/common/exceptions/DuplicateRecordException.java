package com.sgs.vision.common.exceptions;

public class DuplicateRecordException extends Exception {

	private static final long serialVersionUID = 1513577654524037595L;

	private String name;
	
	public DuplicateRecordException(){}
	
	public DuplicateRecordException(String name, String message) {
		super(message);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String username) {
		this.name = username;
	}
	
}
