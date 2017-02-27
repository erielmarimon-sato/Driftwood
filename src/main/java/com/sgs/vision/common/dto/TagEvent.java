package com.sgs.vision.common.dto;

public class TagEvent {

	private Integer id;
	private Long timestamp;
	private String epc;
	private String deviceId;
	private String eventType;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getEpc() {
		return epc;
	}
	
	public void setEpc(String epc) {
		this.epc = epc;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getEventType() {
		return eventType;
	}
	
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
	
}
