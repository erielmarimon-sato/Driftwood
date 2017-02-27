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
@Document(collection="items")
public class Item {

	@Id
	private ObjectId id;
	private ObjectId skuId;
	@Indexed(unique=true)
	private String tokenTag;
	private Date createdTimestamp;
	private Date updatedTimestamp;
	private boolean available;

	private String eventType;

	private String itemStatus;

	private ObjectId readPointId;
	
	private ObjectId userId;
	
	
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
	 * @return the tokenTag
	 */
	public String getTokenTag() {
		return tokenTag;
	}
	/**
	 * @param tokenTag the tokenTag to set
	 */
	public void setTokenTag(String tokenTag) {
		this.tokenTag = tokenTag;
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
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the itemStatus
	 */
	public String getItemStatus() {
		return itemStatus;
	}
	/**
	 * @param itemStatus the itemStatus to set
	 */
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	/**
	 * @return the readPointId
	 */
	public ObjectId getReadPointId() {
		return readPointId;
	}
	/**
	 * @param readPointId the readPointId to set
	 */
	public void setReadPointId(ObjectId readPointId) {
		this.readPointId = readPointId;
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
	 * @return the skuId
	 */
	public ObjectId getSkuId() {
		return skuId;
	}
	/**
	 * @param skuId the skuId to set
	 */
	public void setSkuId(ObjectId skuId) {
		this.skuId = skuId;
	}
}
