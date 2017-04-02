package com.sgs.vision.common.dto;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class GroupDto {

	private String _id;
	private Date dateCreated;
	private Date lastUpdated;
	private List<String> players;
	private String operationsCenter;
	private String admin;
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id.toString();
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	public String getOperationsCenter() {
		return operationsCenter;
	}
	public void setOperationsCenter(String operationsCenter) {
		this.operationsCenter = operationsCenter;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
}
