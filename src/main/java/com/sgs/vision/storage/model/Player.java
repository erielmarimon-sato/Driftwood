package com.sgs.vision.storage.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection="players")
public class Player {
	
	@Id
    private ObjectId id;
	
    private String name;
    private String username;
    private String password;
    private ObjectId groupId;
    private Integer totalGoals;
    private Integer totalAssists;
    private Integer noShow;
    private Integer totalGames;
    private Integer effectiveness;
    private Date playingSince;
    private Date lastDayPlayed;
    private boolean active;
    
    public ObjectId getId() {
        return id;
    }
    
    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(Integer totalGoals) {
        this.totalGoals = totalGoals;
    }

    public Integer getTotalAssists() {
        return totalAssists;
    }

    public void setTotalAssists(Integer totalAssists) {
        this.totalAssists = totalAssists;
    }

    public Integer getNoShow() {
        return noShow;
    }

    public void setNoShow(Integer noShow) {
        this.noShow = noShow;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }

    public Integer getEffectiveness() {
        return effectiveness;
    }

    public void setEffectiveness(Integer effectiveness) {
        this.effectiveness = effectiveness;
    }

    public Date getPlayingSince() {
        return playingSince;
    }

    public void setPlayingSince(Date playingSince) {
        this.playingSince = playingSince;
    }

    public Date getLastDayPlayed() {
        return lastDayPlayed;
    }

    public void setLastDayPlayed(Date lastDayPlayed) {
        this.lastDayPlayed = lastDayPlayed;
    }

    public boolean isActive() {
        return active;
    }

    public boolean getActive(){
        return active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

	public ObjectId getGroup() {
		return groupId;
	}

	public void setGroup(ObjectId group) {
		this.groupId = group;
	}    
    
}
