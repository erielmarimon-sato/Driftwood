package com.sgs.vision.common.dto;

public class SizeOrderDto {

	private int id;
	private String size;
	private Integer sizeOrder;
	private SizeCategoryDto category;
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getSizeOrder() {
		return sizeOrder;
	}

	public void setSizeOrder(Integer sizeOrder) {
		this.sizeOrder = sizeOrder;
	}

	public SizeCategoryDto getCategory() {
		return category;
	}

	public void setCategory(SizeCategoryDto category) {
		this.category = category;
	}

}
