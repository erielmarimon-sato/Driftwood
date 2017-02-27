package com.sgs.vision.common.exceptions;

public class SkuNotFoundException extends Exception{
	
	private static final long serialVersionUID = -6882506688804976846L;
	
	private String sku;
	
	public SkuNotFoundException(String sku) {
		super();
		this.sku = sku;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	
}
