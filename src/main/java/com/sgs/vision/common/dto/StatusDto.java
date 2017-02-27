package com.sgs.vision.common.dto;

public class StatusDto {

	private String priority;
	private Long count;
	private String type;
	
	public StatusDto(String priority, Long count, String type) {
		super();
		this.priority = priority;
		this.count = count;
		this.type = type;
	}
	
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public Long getCount() {
		return count;
	}
	
	public void setCount(Long count) {
		this.count = count;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
