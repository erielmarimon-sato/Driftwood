package com.sgs.vision.common.constants;

import com.sgs.vision.common.exceptions.InvalidIssueTypeException;

public enum IssueTypeEnum {
	
	NOT_ON_FLOOR(1),
	LOW_COUNT(2),
	MISPLACED(3),
	EMPTY(4),
	FITTING_ROOM_REQUEST_ITEM(5),
	FITTING_ROOM_REQUEST_ASSISTANCE(6),
	HIGH_COUNT(7);
	
	private int id;
	
	private IssueTypeEnum(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static IssueTypeEnum getByCode(String type) throws InvalidIssueTypeException{
		IssueTypeEnum issueType = null;
		if (type != null){
			try{
				issueType = IssueTypeEnum.valueOf(type.toUpperCase());
			}catch(Exception ex){
				throw new InvalidIssueTypeException(type);
			}
		}
		return issueType;
	}
}
