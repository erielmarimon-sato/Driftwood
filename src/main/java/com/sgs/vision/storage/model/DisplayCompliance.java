/**

 * Sato Global Solutions - Vision 
 */
package com.sgs.vision.storage.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sreenivasa.Raogopisetti
 *
 */
@Document(collection="display_compliances")
public class DisplayCompliance {

	@Id
	private ObjectId id;
	private ObjectId skuId;
	private ObjectId userId;
	private ObjectId zoneId;
	private Integer minValue;
	private Integer maxValue;
	private Date createdTimestamp;
	private Date updatedTimestamp;
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
	 * @return the zoneId
	 */
	public ObjectId getZoneId() {
		return zoneId;
	}
	/**
	 * @param zoneId the zoneId to set
	 */
	public void setZoneId(ObjectId zoneId) {
		this.zoneId = zoneId;
	}
	/**
	 * @return the minValue
	 */
	public Integer getMinValue() {
		return minValue;
	}
	/**
	 * @param minValue the minValue to set
	 */
	public void setMinValue(Integer minValue) {
		this.minValue = minValue;
	}
	/**
	 * @return the maxValue
	 */
	public Integer getMaxValue() {
		return maxValue;
	}
	/**
	 * @param maxValue the maxValue to set
	 */
	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
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

}
