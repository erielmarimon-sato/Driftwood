package com.sgs.vision.storage.model.history;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.bson.types.ObjectId;

public class InventorySkuHist {

	private ObjectId id;
	private String sku;
	private String skuDesc;
	private Map<String, String> attributes = new HashMap<String, String>();

	private Date createdTimestamp;
	private Date updatedTimestamp;
	
	private Integer itemCount;
	private ObjectId sizeOrderId;
	
	private ObjectId userId;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
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

	public ObjectId getSizeOrderId() {
		return sizeOrderId;
	}

	public void setSizeOrderId(ObjectId sizeOrderId) {
		this.sizeOrderId = sizeOrderId;
	}

	public Integer getItemCount() {
		return itemCount;
	}
	
	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public ObjectId getUserId() {
		return userId;
	}

	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}
	
}