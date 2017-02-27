package com.sgs.vision.api.util.converter;


import org.modelmapper.ModelMapper;

import com.sgs.vision.storage.model.InventorySku;
import com.sgs.vision.storage.model.history.InventorySkuHist;

public class InventorySkuConverter {

	public static InventorySkuHist convertEntityToHistoryDto(InventorySku sku){
		if(sku == null){
			return null;
		}
		ModelMapper mm = new ModelMapper();
		InventorySkuHist inventorySkuHistory = mm.map(sku, InventorySkuHist.class);
		return inventorySkuHistory;
	}
		
	
}
