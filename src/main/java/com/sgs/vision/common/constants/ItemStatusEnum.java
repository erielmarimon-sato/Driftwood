package com.sgs.vision.common.constants;

import com.sgs.vision.common.exceptions.InvalidItemStatusException;

public enum ItemStatusEnum {
	UNKNOWN(1),
	READ(2),
	SOLD(3),
	RETURNED(4);
	
	private Integer id;

	private ItemStatusEnum(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	
	public static ItemStatusEnum getById(Integer id) {
	    for(ItemStatusEnum i : values()) {
	        if(i.id.equals(id)) return i;
	    }
	    return null;
	 }
	
	public static ItemStatusEnum getByCode(String status) throws InvalidItemStatusException{
		ItemStatusEnum itemStatus = null;
		if (status != null){
			try{
				itemStatus = valueOf(status.toUpperCase());
			}catch(Exception ex){
				throw new InvalidItemStatusException(status);
			}
		}
		return itemStatus;
	}
	
	
	
}
