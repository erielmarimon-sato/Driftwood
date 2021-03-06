package com.sgs.vision.common.dto;

import java.util.Date;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PlayerDto {
    
    private ObjectId _id;
//    private String id;
//    private String playerId;
    private String name;
    private String username;
    private String password;
    private Integer totalGoals;
    private Integer totalAssists;
    private Integer noShow;
    private Integer totalGames;
    private Integer effectiveness;
    private Date playingSince;
    private Date lastDayPlayed;
    private boolean active;
    
//    public String getId() {
//        return id;
//    }
//    public void setId(String id) {
//        this.id = id;
//    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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
    public Date getPlayingSince() {
        return playingSince;
    }
    public void setPlayingSince(Date playingSince) {
        this.playingSince = playingSince;
    }
    public Integer getEffectiveness() {
        return effectiveness;
    }
    public void setEffectiveness(Integer effectiveness) {
        this.effectiveness = effectiveness;
    }
    public Date getLastDayPlayed() {
        return lastDayPlayed;
    }
    public void setLastDayPlayed(Date lastDayPlayed) {
        this.lastDayPlayed = lastDayPlayed;
    }
    public String get_id() {
        return _id.toString();
    }
    public void set_id(ObjectId _id) {
        this._id = _id;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}