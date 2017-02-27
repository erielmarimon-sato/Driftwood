package com.sgs.vision.common.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder(value={"inventorySku","itemZone"})
public class InventorySkuDetailDto {

	private InventorySkuDto inventorySku;
	private List<ItemZoneDto> items;
	
	public InventorySkuDto getInventorySku() {
		return inventorySku;
	}
	
	public void setInventorySku(InventorySkuDto inventorySku) {
		this.inventorySku = inventorySku;
	}
	
	public List<ItemZoneDto> getItems() {
		return items;
	}
	
	public void setItems(List<ItemZoneDto> items) {
		this.items = items;
	}
	
}
