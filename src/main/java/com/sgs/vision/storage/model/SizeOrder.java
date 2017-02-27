/**
 * Sato Global Solutions - Vision 
 */
package com.sgs.vision.storage.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sreenivasa.Raogopisetti
 *
 */
@Document(collection="size_orders")
public class SizeOrder {

	@Id
	private ObjectId id;
	private String size;
	private Integer order;
	
	private ObjectId categoryId;
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
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}
	/**
	 * @return the categoryId
	 */
	public ObjectId getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(ObjectId categoryId) {
		this.categoryId = categoryId;
	}

}
