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
@Document(collection="job_statuses")
public class JobStatus {
	
	@Id
	private ObjectId id;
	private String status;
	private String source;
	private String logFile;
	private Date startTime;
	private Date endTime;
	private Integer percentComplete;
	private String remarks;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the logFile
	 */
	public String getLogFile() {
		return logFile;
	}
	/**
	 * @param logFile the logFile to set
	 */
	public void setLogFile(String logFile) {
		this.logFile = logFile;
	}
	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the percentComplete
	 */
	public Integer getPercentComplete() {
		return percentComplete;
	}
	/**
	 * @param percentComplete the percentComplete to set
	 */
	public void setPercentComplete(Integer percentComplete) {
		this.percentComplete = percentComplete;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
