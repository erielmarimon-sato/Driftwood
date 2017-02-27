package com.sgs.vision.storage.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sgs.vision.storage.model.history.InventorySkuHist;
import com.sgs.vision.storage.model.history.ItemHist;
import com.sgs.vision.storage.model.history.ReadPointHist;
import com.sgs.vision.storage.model.history.ZoneHist;

@Document(collection="items_history")
public class ItemHistory {

	@Id private ObjectId id;
    private ItemHist item;
    private InventorySkuHist inventorySku;
    private ReadPointHist readPoint;
    private ZoneHist zone;
	
    public ObjectId getId() {
		return id;
	}
	
	public void setId(ObjectId id) {
		this.id = id;
	}

	public ItemHist getItem() {
		return item;
	}

	public void setItem(ItemHist item) {
		this.item = item;
	}

	public InventorySkuHist getInventorySku() {
		return inventorySku;
	}

	public void setInventorySku(InventorySkuHist inventorySku) {
		this.inventorySku = inventorySku;
	}

	public ReadPointHist getReadPoint() {
		return readPoint;
	}

	public void setReadPoint(ReadPointHist readPoint) {
		this.readPoint = readPoint;
	}

	public ZoneHist getZone() {
		return zone;
	}

	public void setZone(ZoneHist zone) {
		this.zone = zone;
	}
	
    
}
