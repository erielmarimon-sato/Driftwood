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
@Document(collection="read_points")
public class ReadPoint {

	@Id
	private ObjectId id;
	@Indexed(unique=true)
	private String name;
	private String description;
	private Date createdTimestamp;
	private Date updatedTimestamp;

	private ObjectId userId;

	private ObjectId deviceId;

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
	 * @return the device
	 */
	public ObjectId getDeviceId() {
		return deviceId;
	}
	/**
	 * @param device the device to set
	 */
	public void setDeviceId(ObjectId deviceId) {
		this.deviceId = deviceId;
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
	public void setZoneId(ObjectId zoneId) {
		this.zoneId = zoneId;
	}
	
}
