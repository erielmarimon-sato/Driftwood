package com.sgs.vision.common.exceptions;

public class NotSupportedException extends Exception{
	
	private static final long serialVersionUID = -7297923434145862143L;
	
	private Integer code;
	
	private String msg;
	
	public NotSupportedException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	
}
