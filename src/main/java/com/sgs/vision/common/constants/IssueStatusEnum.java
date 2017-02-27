package com.sgs.vision.common.constants;

import com.sgs.vision.common.exceptions.InvalidIssueStatusException;

public enum IssueStatusEnum {
	
	OPENED(1),
	ACCEPTED(2),
	RELEASED(3),
	COMPLETED(4);
	
	private int id;
	
	private IssueStatusEnum(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static IssueStatusEnum getByCode(String status) throws InvalidIssueStatusException{
		IssueStatusEnum issueStatus = null;
		if (status != null){
			try{
				issueStatus = IssueStatusEnum.valueOf(status.toUpperCase());
				
			}catch(Exception ex){
				throw new InvalidIssueStatusException(status);
			}
		}
		return issueStatus;
	}
}
