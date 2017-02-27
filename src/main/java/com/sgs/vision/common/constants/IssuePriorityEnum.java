package com.sgs.vision.common.constants;

import com.sgs.vision.common.exceptions.InvalidIssuePriorityException;

public enum IssuePriorityEnum {
	
	HIGH(1),
	MEDIUM(2),
	LOW(3);
	
	private int id;

	private IssuePriorityEnum(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static IssuePriorityEnum getIssuePriority(String priority) throws InvalidIssuePriorityException{
		IssuePriorityEnum issuePriority = null;
		if (priority != null){
			try{
				issuePriority = IssuePriorityEnum.valueOf(priority.toUpperCase());
			}catch(Exception ex){
				throw new InvalidIssuePriorityException(priority);
			}
		}
		return issuePriority;
	}
}
