package com.sgs.vision.storage.model.history;

import java.util.Date;

import org.bson.types.ObjectId;

public class IssueHist {
	
	private ObjectId id;
	private ObjectId skuId;
	private String issuePriority;
	private String issueStatus;
	private String issueType;

	private ObjectId createdBy;
	private ObjectId updatedBy;
	private ObjectId zoneByCurrentZoneId;
	
	
	private ObjectId zoneByTargetZoneId;
	private Integer currentCount;
	private Integer minCount;
	private Integer maxCount;
	private Date createdTimestamp;
	private Date updatedTimestamp;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getIssuePriority() {
		return issuePriority;
	}

	public void setIssuePriority(String issuePriority) {
		this.issuePriority = issuePriority;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public Integer getCurrentCount() {
		return currentCount;
	}

	public void setCurrentCount(Integer currentCount) {
		this.currentCount = currentCount;
	}

	public Integer getMinCount() {
		return minCount;
	}

	public void setMinCount(Integer minCount) {
		this.minCount = minCount;
	}

	public Integer getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Date getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(Date updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	public ObjectId getSkuId() {
		return skuId;
	}

	public void setSkuId(ObjectId skuId) {
		this.skuId = skuId;
	}

	public ObjectId getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(ObjectId createdBy) {
		this.createdBy = createdBy;
	}

	public ObjectId getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(ObjectId updatedBy) {
		this.updatedBy = updatedBy;
	}

	public ObjectId getZoneByCurrentZoneId() {
		return zoneByCurrentZoneId;
	}

	public void setZoneByCurrentZoneId(ObjectId zoneByCurrentZoneId) {
		this.zoneByCurrentZoneId = zoneByCurrentZoneId;
	}

	public ObjectId getZoneByTargetZoneId() {
		return zoneByTargetZoneId;
	}

	public void setZoneByTargetZoneId(ObjectId zoneByTargetZoneId) {
		this.zoneByTargetZoneId = zoneByTargetZoneId;
	}

}
