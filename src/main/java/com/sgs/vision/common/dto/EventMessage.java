/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgs.vision.common.dto;

import java.util.Date;

public class EventMessage {
    
    private String epc;
    private String reader;
    private String eventType;
    private String facilityId;
    private long timestamp;
    
    public EventMessage(){}
    
    private EventMessage(EventMessageBuilder emb){
    	this.epc = emb.epc;
    	this.reader = emb.reader;
    	this.eventType = emb.eventType;
    	this.facilityId = emb.facilityId;
    	this.timestamp = emb.timestamp;
    }
    
    public String getEpc() {
        return epc;
    }

    public void setEpc(String epc) {
        this.epc = epc;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    
    public String getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    public static class EventMessageBuilder{
    	
    	private String epc;
	    private String reader;
	    private String eventType;
	    private String facilityId;
	    private long timestamp;
	    
		public EventMessageBuilder(String epc, String reader) {
			super();
			this.epc = epc;
			this.reader = reader;
			this.eventType = "arrival";
			this.timestamp = new Date().getTime();
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public void setFacilityId(String facilityId) {
			this.facilityId = facilityId;
		}
		
		public EventMessage getInstance(){
			return new EventMessage(this);
		}
    }
    
}
