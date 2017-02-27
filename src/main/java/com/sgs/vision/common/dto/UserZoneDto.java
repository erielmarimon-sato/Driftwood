package com.sgs.vision.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserZoneDto {

	private String id;
	private String userId;
	private ZoneDto zoneDto;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the zoneDto
	 */
	public ZoneDto getZoneDto() {
		return zoneDto;
	}
	/**
	 * @param zoneDto the zoneDto to set
	 */
	public void setZoneDto(ZoneDto zoneDto) {
		this.zoneDto = zoneDto;
	}

	
}
