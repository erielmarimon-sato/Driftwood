/**
 * Sato Global Solutions - Vision 
 */
package com.sgs.vision.storage.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sreenivasa.Raogopisetti
 *
 */
@Document(collection="issues")
public class Issue {
	@Id
	private ObjectId id;
	private ObjectId skuId;
	private String issuePriority;
	private String issueStatus;
	private String issueType;

	private ObjectId userAccountByUserId;

	private ObjectId userAccountByLastUpdatedUser;

	private ObjectId zoneByCurrentZoneId;

	private ObjectId zoneByTargetZoneId;
	
	private Integer currentCount;
	private Integer minCount;
	private Integer maxCount;
	private Date createdTimestamp;
	private Date updatedTimestamp;
	private String typeName;
	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}
	/**
	 * @return the skuId
	 */
	public ObjectId getSkuId() {
		return skuId;
	}
	/**
	 * @param skuId the skuId to set
	 */
	public void setSkuId(ObjectId skuId) {
		this.skuId = skuId;
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
	 * @return the userAccountByUserId
	 */
	public ObjectId getUserAccountByUserId() {
		return userAccountByUserId;
	}
	/**
	 * @param userAccountByUserId the userAccountByUserId to set
	 */
	public void setUserAccountByUserId(ObjectId userAccountByUserId) {
		this.userAccountByUserId = userAccountByUserId;
	}
	/**
	 * @return the userAccountByLastUpdatedUser
	 */
	public ObjectId getUserAccountByLastUpdatedUser() {
		return userAccountByLastUpdatedUser;
	}
	/**
	 * @param userAccountByLastUpdatedUser the userAccountByLastUpdatedUser to set
	 */
	public void setUserAccountByLastUpdatedUser(ObjectId userAccountByLastUpdatedUser) {
		this.userAccountByLastUpdatedUser = userAccountByLastUpdatedUser;
	}
	/**
	 * @return the zoneByCurrentZoneId
	 */
	public ObjectId getZoneByCurrentZoneId() {
		return zoneByCurrentZoneId;
	}
	/**
	 * @param zoneByCurrentZoneId the zoneByCurrentZoneId to set
	 */
	public void setZoneByCurrentZoneId(ObjectId zoneByCurrentZoneId) {
		this.zoneByCurrentZoneId = zoneByCurrentZoneId;
	}
	/**
	 * @return the zoneByTargetZoneId
	 */
	public ObjectId getZoneByTargetZoneId() {
		return zoneByTargetZoneId;
	}
	/**
	 * @param zoneByTargetZoneId the zoneByTargetZoneId to set
	 */
	public void setZoneByTargetZoneId(ObjectId zoneByTargetZoneId) {
		this.zoneByTargetZoneId = zoneByTargetZoneId;
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
	 * @return the createdTimestamp
	 */
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}
	/**
	 * @param createdTimestamp the createdTimestamp to set
	 */
	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	/**
	 * @return the updatedTimestamp
	 */
	public Date getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	/**
	 * @param updatedTimestamp the updatedTimestamp to set
	 */
	public void setUpdatedTimestamp(Date updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}
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
}
