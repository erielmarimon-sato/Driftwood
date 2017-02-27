package com.sgs.vision.common.exceptions;

public class ItemNotFoundException extends Exception{
	
	private static final long serialVersionUID = -6071541807860269179L;
	
	private String id;
	
	public ItemNotFoundException(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
