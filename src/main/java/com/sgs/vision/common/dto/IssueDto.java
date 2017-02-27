package com.sgs.vision.common.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties( { "issueType","issuePriority","issueStatus" })
public class IssueDto {

	private String id;
	private InventorySkuDto inventorySku;
	private String targetZoneId;
	private String targetZoneName;
	private String currentZoneId;
	private String currentZoneName;
	private Integer currentCount;
	private Integer minCount;
	private Integer maxCount;
	@SuppressWarnings("unused")
	private String issueTypeName;
	private String issueType;
	@SuppressWarnings("unused")
	private String issuePriorityName;
	private String issuePriority;
	private String issueStatus;
	@SuppressWarnings("unused")
	private String issueStatusName;
	private String createdTimestamp;
	private String updatedTimestamp;
	
	private String typeName;
	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}
	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the inventorySku
	 */
	public InventorySkuDto getInventorySku() {
		return inventorySku;
	}
	/**
	 * @param inventorySku the inventorySku to set
	 */
	public void setInventorySku(InventorySkuDto inventorySku) {
		this.inventorySku = inventorySku;
	}
	/**
	 * @return the targetZoneId
	 */
	public String getTargetZoneId() {
		return targetZoneId;
	}
	/**
	 * @param targetZoneId the targetZoneId to set
	 */
	public void setTargetZoneId(String targetZoneId) {
		this.targetZoneId = targetZoneId;
	}
	/**
	 * @return the targetZoneName
	 */
	public String getTargetZoneName() {
		return targetZoneName;
	}
	/**
	 * @param targetZoneName the targetZoneName to set
	 */
	public void setTargetZoneName(String targetZoneName) {
		this.targetZoneName = targetZoneName;
	}
	/**
	 * @return the currentZoneId
	 */
	public String getCurrentZoneId() {
		return currentZoneId;
	}
	/**
	 * @param currentZoneId the currentZoneId to set
	 */
	public void setCurrentZoneId(String currentZoneId) {
		this.currentZoneId = currentZoneId;
	}
	/**
	 * @return the currentZoneName
	 */
	public String getCurrentZoneName() {
		return currentZoneName;
	}
	/**
	 * @param currentZoneName the currentZoneName to set
	 */
	public void setCurrentZoneName(String currentZoneName) {
		this.currentZoneName = currentZoneName;
	}
	/**
	 * @return the currentCount
	 */
	public Integer getCurrentCount() {
		return currentCount;
	}
	/**
	 * @param currentCount the currentCount to set
	 */
	public void setCurrentCount(Integer currentCount) {
		this.currentCount = currentCount;
	}
	/**
	 * @return the minCount
	 */
	public Integer getMinCount() {
		return minCount;
	}
	/**
	 * @param minCount the minCount to set
	 */
	public void setMinCount(Integer minCount) {
		this.minCount = minCount;
	}
	/**
	 * @return the maxCount
	 */
	public Integer getMaxCount() {
		return maxCount;
	}
	/**
	 * @param maxCount the maxCount to set
	 */
	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}
	/**
	 * @return the issueTypeName
	 */
	public String getIssueTypeName() {
		return issueType;
	}
	/**
	 * @param issueTypeName the issueTypeName to set
	 */
	public void setIssueTypeName(String issueTypeName) {
		this.issueTypeName = issueType;
	}
	/**
	 * @return the issuePriorityName
	 */
	public String getIssuePriorityName() {
		return issuePriority;
	}
	/**
	 * @param issuePriorityName the issuePriorityName to set
	 */
	public void setIssuePriorityName(String issuePriorityName) {
		this.issuePriorityName = issuePriority;
	}
	/**
	 * @return the issueStatusName
	 */
	public String getIssueStatusName() {
		return issueStatus;
	}
	/**
	 * @param issueStatusName the issueStatusName to set
	 */
	public void setIssueStatusName(String issueStatusName) {
		this.issueStatusName = issueStatus;
	}
	/**
	 * @return the createdTimestamp
	 */
	public String getCreatedTimestamp() {
		return createdTimestamp;
	}
	/**
	 * @param createdTimestamp the createdTimestamp to set
	 */
	public void setCreatedTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	/**
	 * @return the updatedTimestamp
	 */
	public String getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	/**
	 * @param updatedTimestamp the updatedTimestamp to set
	 */
	public void setUpdatedTimestamp(String updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}
	/**
	 * @return the issuePriority
	 */
	public String getIssuePriority() {
		return issuePriority;
	}
	/**
	 * @param issuePriority the issuePriority to set
	 */
	public void setIssuePriority(String issuePriority) {
		this.issuePriority = issuePriority;
	}
	/**
	 * @return the issueType
	 */
	public String getIssueType() {
		return issueType;
	}
	/**
	 * @param issueType the issueType to set
	 */
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	/**
	 * @return the issueStatus
	 */
	public String getIssueStatus() {
		return issueStatus;
	}
	/**
	 * @param issueStatus the issueStatus to set
	 */
	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

}
