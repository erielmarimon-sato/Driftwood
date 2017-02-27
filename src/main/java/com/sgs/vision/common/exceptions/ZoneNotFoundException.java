package com.sgs.vision.common.exceptions;

public class ZoneNotFoundException extends Exception{
	
	private static final long serialVersionUID = -7297923434145862143L;
	
	private String zoneId;
	
	public ZoneNotFoundException(String zoneId) {
		super();
		this.zoneId = zoneId;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	
	
}
