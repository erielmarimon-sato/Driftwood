package com.sgs.vision.common.exceptions;

public class IssueNotFoundException extends Exception{

	private static final long serialVersionUID = 7805870959018205856L;
	
	private String id;
	
	public IssueNotFoundException(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
