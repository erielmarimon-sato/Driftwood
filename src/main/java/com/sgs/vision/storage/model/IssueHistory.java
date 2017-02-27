package com.sgs.vision.storage.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sgs.vision.storage.model.history.InventorySkuHist;
import com.sgs.vision.storage.model.history.IssueHist;
import com.sgs.vision.storage.model.history.UserHist;
import com.sgs.vision.storage.model.history.ZoneHist;

@Document(collection="issues_history")
public class IssueHistory {

	@Id private ObjectId id;
    private IssueHist issue;
    private InventorySkuHist inventorySku;
    private ZoneHist targetZone;
    private ZoneHist currentZone;
    private UserHist user;
    
	public ObjectId getId() {
		return id;
	}
	
	public void setId(ObjectId id) {
		this.id = id;
	}
	
	public IssueHist getIssue() {
		return issue;
	}
	
	public void setIssue(IssueHist issue) {
		this.issue = issue;
	}
	
	public InventorySkuHist getInventorySku() {
		return inventorySku;
	}
	
	public void setInventorySku(InventorySkuHist inventorySku) {
		this.inventorySku = inventorySku;
	}
	
	public ZoneHist getTargetZone() {
		return targetZone;
	}
	
	public void setTargetZone(ZoneHist targetZone) {
		this.targetZone = targetZone;
	}
	
	public ZoneHist getCurrentZone() {
		return currentZone;
	}
	
	public void setCurrentZone(ZoneHist currentZone) {
		this.currentZone = currentZone;
	}
	
	public UserHist getUser() {
		return user;
	}
	
	public void setUser(UserHist user) {
		this.user = user;
	}
    
}
