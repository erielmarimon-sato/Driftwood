/**
 * Sato Global Solutions - Vision 
 */
package com.sgs.vision.storage.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author Sreenivasa.Raogopisetti
 *
 */
@Document(collection="zones")
public class Zone {
	
	@Id
	private ObjectId id;
	@Indexed(unique=true)
	private String name;
	private String description;
	private Date createdTimestamp;
	private Date updatedTimestamp;
	

	private String zoneType;

	private ObjectId userId;

	private ObjectId locationId;
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the createdTimestamp
	 */
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}
	/**
	 * @param createdTimestamp the createdTimestamp to set
	 */
	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	/**
	 * @return the updatedTimestamp
	 */
	public Date getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	/**
	 * @param updatedTimestamp the updatedTimestamp to set
	 */
	public void setUpdatedTimestamp(Date updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	/**
	 * @return the userId
	 */
	public ObjectId getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}
	/**
	 * @return the locationId
	 */
	public ObjectId getLocationId() {
		return locationId;
	}
	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(ObjectId locationId) {
		this.locationId = locationId;
	}
	/**
	 * @return the zoneType
	 */
	public String getZoneType() {
		return zoneType;
	}
	/**
	 * @param zoneType the zoneType to set
	 */
	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}
		
}
