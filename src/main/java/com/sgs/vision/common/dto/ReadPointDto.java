package com.sgs.vision.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class ReadPointDto {

	private String id;
	private String name;
	private String description;
	private String type;
	private ZoneDto zoneDto;
	private DeviceDto deviceDto;
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@JsonProperty("zone")
	public ZoneDto getZoneDto() {
		return zoneDto;
	}

	public void setZoneDto(ZoneDto zoneDto) {
		this.zoneDto = zoneDto;
	}

	@JsonProperty("device")
	public DeviceDto getDeviceDto() {
		return deviceDto;
	}

	public void setDeviceDto(DeviceDto deviceDto) {
		this.deviceDto = deviceDto;
	}
	
}
