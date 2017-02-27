package com.sgs.vision.storage.criteria;

import com.sgs.vision.common.constants.IssuePriorityEnum;
import com.sgs.vision.common.constants.IssueStatusEnum;
import com.sgs.vision.common.constants.IssueTypeEnum;

public class IssueSearchCriteria {
	
	private String userId; 
	private String acceptedUserId; 
	private IssuePriorityEnum issuePriority;
	private IssueTypeEnum issueType;
	private IssueStatusEnum issueStatus;
	private String targetZoneId;
	
	public IssueSearchCriteria(){
		userId = null;
		acceptedUserId = null;
		targetZoneId = null;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAcceptedUserId() {
		return acceptedUserId;
	}
	
	public void setAcceptedUserId(String acceptedUserId) {
		this.acceptedUserId = acceptedUserId;
	}
	
	public IssuePriorityEnum getIssuePriority() {
		return issuePriority;
	}
	
	public void setIssuePriority(IssuePriorityEnum issuePriority) {
		this.issuePriority = issuePriority;
	}
	
	public IssueTypeEnum getIssueType() {
		return issueType;
	}
	
	public void setIssueType(IssueTypeEnum issueType) {
		this.issueType = issueType;
	}
	
	public IssueStatusEnum getIssueStatus() {
		return issueStatus;
	}
	
	public void setIssueStatus(IssueStatusEnum issueStatus) {
		this.issueStatus = issueStatus;
	}

	public String getTargetZoneId() {
		return targetZoneId;
	}

	public void setTargetZoneId(String targetZoneId) {
		this.targetZoneId = targetZoneId;
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(" UserId :"+getUserId())
		.append(" acceptedUserId:"+getAcceptedUserId())
		.append(" issuePriority:"+getIssuePriority())
		.append(" issueType:"+getIssueType())
		.append(" issueStatus:"+getIssueStatus())
		.append(" targetZoneId:"+getTargetZoneId());
		return sb.toString();
	}
}
