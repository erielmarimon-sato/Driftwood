package com.sgs.vision.common.exceptions;

public class InvalidIssueStatusException extends Exception{

	private static final long serialVersionUID = -5073312621778294856L;
	
	private String status;
	
	public InvalidIssueStatusException(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
