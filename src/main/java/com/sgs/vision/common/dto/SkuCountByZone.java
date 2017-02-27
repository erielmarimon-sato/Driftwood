package com.sgs.vision.common.dto;

public class SkuCountByZone {

	private String zoneId;
	private String zoneName;
	private String zoneType;
	private String zoneDescription;
	private Long count;
	
	public SkuCountByZone(String zoneId, String zoneName, String zoneType, String zoneDescription, Long count) {
		this.zoneId = zoneId;
		this.zoneName = zoneName;
		this.zoneType = zoneType;
		this.zoneDescription = zoneDescription;
		this.count = count;
	}

	public String getZoneId() {
		return zoneId;
	}
	
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	
	public String getZoneName() {
		return zoneName;
	}
	
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	
	public String getZoneType() {
		return zoneType;
	}
	
	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}
	
	public String getZoneDescription() {
		return zoneDescription;
	}
	
	public void setZoneDescription(String zoneDescription) {
		this.zoneDescription = zoneDescription;
	}
	
	public Long getCount() {
		return count;
	}
	
	public void setCount(Long count) {
		this.count = count;
	}
	
}
