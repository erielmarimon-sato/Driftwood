package com.sgs.vision.common.constants;

public enum EventTypeEnum {

	DEPARTURE(1),
	ARRIVAL(2);

	
	private int id;

	private EventTypeEnum(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
