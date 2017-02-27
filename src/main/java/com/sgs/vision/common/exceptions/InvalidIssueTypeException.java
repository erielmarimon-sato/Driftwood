package com.sgs.vision.common.exceptions;

public class InvalidIssueTypeException extends Exception{

	private static final long serialVersionUID = -3683898693154248210L;
	
	private String type;
	
	public InvalidIssueTypeException(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
