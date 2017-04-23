package com.sgs.vision.common.dto;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GameDto {
    private String id;
    private String date;
    private String time;
    private List<String> teamOne;
    private List<String> teamTwo;
    private List<String> players;
    private Integer teamOneScore;
    private Integer teamTwoScore;
    private String mVP;
    private String gameType;
    
    public String getId() {
        return id.toString();
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
 
    public List<String> getPlayers() {
        return players;
    }
    public void setPlayers(List<String> players) {
        this.players = players;
    }
    public Integer getTeamOneScore() {
        return teamOneScore;
    }
    public void setTeamOneScore(Integer teamOneScore) {
        this.teamOneScore = teamOneScore;
    }
    public Integer getTeamTwoScore() {
        return teamTwoScore;
    }
    public void setTeamTwoScore(Integer teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }
    
    public String getGameType() {
        return gameType;
    }
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
    public List<String> getTeamOne() {
        return teamOne;
    }
    public void setTeamOne(List<String> teamOne) {
        this.teamOne = teamOne;
    }
    public List<String> getTeamTwo() {
        return teamTwo;
    }
    public void setTeamTwo(List<String> teamTwo) {
        this.teamTwo = teamTwo;
    }
    public String getmVP() {
        return mVP;
    }
    public void setmVP(String mVP) {
        this.mVP = mVP;
    }
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
    
}
