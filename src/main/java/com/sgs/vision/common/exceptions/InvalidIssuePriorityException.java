package com.sgs.vision.common.exceptions;

public class InvalidIssuePriorityException extends Exception{

	private static final long serialVersionUID = -8903312484209086999L;
	
	private String priority;
	

	public InvalidIssuePriorityException(String priority) {
		this.priority = priority;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
}
