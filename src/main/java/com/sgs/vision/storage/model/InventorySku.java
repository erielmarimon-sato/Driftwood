/**
 * 
 */
package com.sgs.vision.storage.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * 
 * @author Sreenivasa.Raogopisetti
 *
 */
@Document(collection="inventory_skus")
public class InventorySku {

	@Id
	private ObjectId id;
	@Indexed(direction = IndexDirection.ASCENDING, unique = true)
	private String sku;
	private String skuDesc;
	private Map<String, String> attributes = new HashMap<String, String>();

	private Date createdTimestamp;
	private Date updatedTimestamp;
	
	private Integer itemCount;
	private ObjectId sizeOrderId;
	
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
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}
	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
	/**
	 * @return the skuDesc
	 */
	public String getSkuDesc() {
		return skuDesc;
	}
	/**
	 * @param skuDesc the skuDesc to set
	 */
	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}
	/**
	 * @return the attributes
	 */
	public Map<String, String> getAttributes() {
		return attributes;
	}
	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
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
	 * @return the sizeOrderId
	 */
	public ObjectId getSizeOrderId() {
		return sizeOrderId;
	}
	/**
	 * @param sizeOrderId the sizeOrderId to set
	 */
	public void setSizeOrderId(ObjectId sizeOrderId) {
		this.sizeOrderId = sizeOrderId;
	}
	/**
	 * @return the itemCount
	 */
	public Integer getItemCount() {
		return itemCount;
	}
	/**
	 * @param itemCount the itemCount to set
	 */
	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
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
	
}
