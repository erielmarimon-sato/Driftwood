package com.sgs.vision.common.exceptions;

public class InvalidDataException extends Exception{

	private static final long serialVersionUID = 1513577654524037595L;

	private String msg;
	
	public InvalidDataException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
