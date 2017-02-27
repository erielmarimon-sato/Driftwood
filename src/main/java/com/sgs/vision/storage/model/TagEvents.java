package com.sgs.vision.storage.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="tag_events")
public class TagEvents {

	@Id
	private String id;
	private Long utcTimestamp;
	private String facilityId;
	private String epc;
	private String tid;
	private String epcEncodeFormat;
	private String eventType;
	private String deviceId;
	private Date createdTimestampUtc;
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
	 * @return the utcTimestamp
	 */
	public Long getUtcTimestamp() {
		return utcTimestamp;
	}
	/**
	 * @param utcTimestamp the utcTimestamp to set
	 */
	public void setUtcTimestamp(Long utcTimestamp) {
		this.utcTimestamp = utcTimestamp;
	}
	/**
	 * @return the facilityId
	 */
	public String getFacilityId() {
		return facilityId;
	}
	/**
	 * @param facilityId the facilityId to set
	 */
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}
	/**
	 * @return the epc
	 */
	public String getEpc() {
		return epc;
	}
	/**
	 * @param epc the epc to set
	 */
	public void setEpc(String epc) {
		this.epc = epc;
	}
	/**
	 * @return the tid
	 */
	public String getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}
	/**
	 * @return the epcEncodeFormat
	 */
	public String getEpcEncodeFormat() {
		return epcEncodeFormat;
	}
	/**
	 * @param epcEncodeFormat the epcEncodeFormat to set
	 */
	public void setEpcEncodeFormat(String epcEncodeFormat) {
		this.epcEncodeFormat = epcEncodeFormat;
	}
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}
	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	/**
	 * @return the createdTimestampUtc
	 */
	public Date getCreatedTimestampUtc() {
		return createdTimestampUtc;
	}
	/**
	 * @param createdTimestampUtc the createdTimestampUtc to set
	 */
	public void setCreatedTimestampUtc(Date createdTimestampUtc) {
		this.createdTimestampUtc = createdTimestampUtc;
	}
	
}
