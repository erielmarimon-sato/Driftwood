package com.sgs.vision.storage.model.history;

import java.util.Date;

import org.bson.types.ObjectId;

public class ItemHist {

	private ObjectId id;
	private ObjectId skuId;
	private String tokenTag;
	private String itemStatus;
	private boolean available;
	private ObjectId readPointId;

	private ObjectId userId;
	private Date createdTimestamp;
	private Date updatedTimestamp;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getTokenTag() {
		return tokenTag;
	}

	public void setTokenTag(String tokenTag) {
		this.tokenTag = tokenTag;
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

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public ObjectId getReadPointId() {
		return readPointId;
	}

	public void setReadPointId(ObjectId readPointId) {
		this.readPointId = readPointId;
	}

	public ObjectId getUserId() {
		return userId;
	}

	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}
	
	public ObjectId getSkuId() {
		return skuId;
	}
	
	public void setSkuId(ObjectId skuId) {
		this.skuId = skuId;
	}
	
}
