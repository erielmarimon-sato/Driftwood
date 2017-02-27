package com.sgs.vision.common.exceptions;

public class ReadPointNotFoundException extends Exception{
	
	private static final long serialVersionUID = 9039988890456763418L;
	
	private String readPoint;
	
	public ReadPointNotFoundException(String readPoint) {
		this.readPoint = readPoint;
	}

	public String getReadPoint() {
		return readPoint;
	}

	public void setReadPoint(String readPoint) {
		this.readPoint = readPoint;
	}
	
	
}
