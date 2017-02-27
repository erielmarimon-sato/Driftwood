package com.sgs.vision.common.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class DisplayComplianceDto {

	private String id;
	private InventorySkuDto inventorySkuDto;

	private ZoneDto zoneDto;
	private Integer minValue;
	private Integer maxValue;
	private Date createdTimestamp;
	private Date updatedTimestamp;
	             
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
	@JsonProperty("inventory")
	public InventorySkuDto getInventorySkuDto() {
		return inventorySkuDto;
	}
	public void setInventorySkuDto(InventorySkuDto inventorySkuDto) {
		this.inventorySkuDto = inventorySkuDto;
	}
	@JsonProperty("zone")
	public ZoneDto getZoneDto() {
		return zoneDto;
	}
	public void setZoneDto(ZoneDto zoneDto) {
		this.zoneDto = zoneDto;
	}
	public Integer getMinValue() {
		return minValue;
	}
	public void setMinValue(Integer minValue) {
		this.minValue = minValue;
	}
	public Integer getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	public Date getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	public void setUpdatedTimestamp(Date updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

}
