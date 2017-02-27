/**
 * Sato Global Solutions - Vision 
 */
package com.sgs.vision.storage.model;

import org.joda.time.DateTime;

/**
 * @author Sreenivasa.Raogopisetti
 *
 */
public class Audit {


	private String createdBy;
	private DateTime createdDate;
	private String lastUpdatedBy;
	private DateTime lastUpdatedDate;
	/**
	 * @return the createdDate
	 */
	public DateTime getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the lastUpdatedDate
	 */
	public DateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(DateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	
}
