package com.sgs.vision.common.dto;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GameDto {
    private String _id;
    private Date date;
    private List<String> teamOne;
    private List<String> teamTwo;
    private List<String> players;
    private Integer teamOneScore;
    private Integer teamTwoScore;
//    private List<ScoreDetails> scores;
    private String mVP;
    private String gameType;
    
    public String get_id() {
        return _id.toString();
    }
    public void set_id(ObjectId _id) {
        this._id = _id.toString();
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
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
    
}
