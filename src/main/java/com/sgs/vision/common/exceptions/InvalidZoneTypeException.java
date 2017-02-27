package com.sgs.vision.common.exceptions;

public class InvalidZoneTypeException extends Exception{

	private static final long serialVersionUID = 3796994212683395293L;
	
	private String zoneType;
	
	public InvalidZoneTypeException(String zoneType) {
		this.zoneType = zoneType;
	}

	public String getZoneType() {
		return zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}

}
