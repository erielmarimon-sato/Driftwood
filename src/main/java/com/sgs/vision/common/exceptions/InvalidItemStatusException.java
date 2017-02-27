package com.sgs.vision.common.exceptions;

public class InvalidItemStatusException extends Exception{

	private static final long serialVersionUID = -6338381466250771612L;
	
	private String status;
	
	public InvalidItemStatusException(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
