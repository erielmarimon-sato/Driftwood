package com.sgs.vision.common.dto;

public class FittingRoomStatus {

	private String fittingRoom;
	private Long itemsCount;
	private Long issuesCount;
	private String dateOldestIssue;
	private String dateRequestedAssistance;
	
	public String getFittingRoom() {
		return fittingRoom;
	}
	
	public void setFittingRoom(String fittingRoom) {
		this.fittingRoom = fittingRoom;
	}
	
	public Long getItemsCount() {
		return itemsCount;
	}
	
	public void setItemsCount(Long itemsCount) {
		this.itemsCount = itemsCount;
	}
	
	public Long getIssuesCount() {
		return issuesCount;
	}
	
	public void setIssuesCount(Long issuesCount) {
		this.issuesCount = issuesCount;
	}

	public String getDateOldestIssue() {
		return dateOldestIssue;
	}

	public void setDateOldestIssue(String dateOldestIssue) {
		this.dateOldestIssue = dateOldestIssue;
	}

	public String getDateRequestedAssistance() {
		return dateRequestedAssistance;
	}

	public void setDateRequestedAssistance(String dateRequestedAssistance) {
		this.dateRequestedAssistance = dateRequestedAssistance;
	}
	
}
