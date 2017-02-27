package com.sgs.vision.common.constants;

import com.sgs.vision.common.exceptions.InvalidZoneTypeException;

public enum ZoneTypeEnum {
	
	FITTING_ROOM(1),
	BACK_OF_STORE(2),
	SHELF(3),
	CHECKOUT(4),
	RETURNS(5);
	private int id;
	
	private ZoneTypeEnum(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public static ZoneTypeEnum getByCode(String zoneType) throws InvalidZoneTypeException{
		ZoneTypeEnum type = null;
		if (zoneType != null){
			try{
				type = ZoneTypeEnum.valueOf(zoneType.toUpperCase());
			}catch(Exception ex){
				throw new InvalidZoneTypeException(zoneType);
			}
		}
		return type;
	}
}
