package com.sgs.vision.common.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class InventorySkuDto {
	
	private String id;
	private Integer itemCount;
	private String sku;
	private String skuDesc;
	private Map<String, String> attributes;
	private String zoneId;
	private String zoneName;
	private String zoneDescription;
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getSkuDesc() {
		return skuDesc;
	}
	
	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}
	
	public Map<String, String> getAttributes() {
		return attributes;
	}
	
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneDescription() {
		return zoneDescription;
	}

	public void setZoneDescription(String zoneDescription) {
		this.zoneDescription = zoneDescription;
	}

}
