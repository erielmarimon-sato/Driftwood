package com.sgs.vision.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ItemAvailabilityCountDto {

	private Boolean available;
	private Long count;
	
	public ItemAvailabilityCountDto(Boolean available, Long count) {
		this.available = available;
		this.count = count;
	}

	public Boolean getAvailable() {
		return available;
	}
	
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	public Long getCount() {
		return count;
	}
	
	public void setCount(Long count) {
		this.count = count;
	}
	
}
