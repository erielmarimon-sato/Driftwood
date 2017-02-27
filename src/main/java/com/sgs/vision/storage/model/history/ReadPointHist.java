package com.sgs.vision.storage.model.history;

import java.util.Date;

import org.bson.types.ObjectId;

public class ReadPointHist {

	private ObjectId id;
	private String name;
	private String description;
	private Date createdTimestamp;
	private Date updatedTimestamp;

	private ObjectId userId;

	private ObjectId deviceId;

	private ObjectId zoneId;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ObjectId getUserId() {
		return userId;
	}

	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public ObjectId getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(ObjectId deviceId) {
		this.deviceId = deviceId;
	}

	public ObjectId getZoneId() {
		return zoneId;
	}

	public void setZoneId(ObjectId zoneId) {
		this.zoneId = zoneId;
	}
	
}
