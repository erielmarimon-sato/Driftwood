package com.sgs.vision.common.exceptions;

public class ObjectNotFoundException extends Exception{
	
	private static final long serialVersionUID = -7297923434145862143L;
	
	private String id;
	
	private String msg;
	
	public ObjectNotFoundException(String id, String msg) {
		super(msg);
		this.id = id;
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
