package com.sgs.vision.storage.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="groups")
public class Group {
	@Id
	private ObjectId id;
	private Date dateCreated;
	private Date lastUpdated;
	private List<ObjectId> players;
	private String operationsCenter;
	private ObjectId admin;
	
	public ObjectId getId(){
        return id;
    }
	
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public List<ObjectId> getPlayers() {
		return players;
	}
	public void setPlayers(List<ObjectId> players) {
		this.players = players;
	}
	public String getOperationsCenter() {
		return operationsCenter;
	}
	public void setOperationsCenter(String operationsCenter) {
		this.operationsCenter = operationsCenter;
	}
	public ObjectId getAdmin() {
		return admin;
	}
	public void setAdmin(ObjectId admin) {
		this.admin = admin;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
