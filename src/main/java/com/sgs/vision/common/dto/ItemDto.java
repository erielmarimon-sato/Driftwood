package com.sgs.vision.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ItemDto {

	private String id;
	private String tag;
	private String tokenTag;
	private InventorySkuDto sku;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the sku
	 */
	public InventorySkuDto getSku() {
		return sku;
	}
	/**
	 * @param sku the sku to set
	 */
	public void setSku(InventorySkuDto sku) {
		this.sku = sku;
	}
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
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
	
}
