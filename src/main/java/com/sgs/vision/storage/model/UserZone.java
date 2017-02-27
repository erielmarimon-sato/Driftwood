package com.sgs.vision.storage.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user_zones")
public class UserZone {

	@Id
	private ObjectId id;

	private ObjectId userId;
	

	private ObjectId zoneId;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}

	/**
	 * @return the user
	 */
	public ObjectId getUserId() {
		return userId;
	}

	/**
	 * @param user the user to set
	 */
	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}

	/**
	 * @return the zone
	 */
	public ObjectId getZoneId() {
		return zoneId;
	}

	/**
	 * @param zone the zone to set
	 */
	public void setZone(ObjectId zoneId) {
		this.zoneId = zoneId;
	}
	
}
