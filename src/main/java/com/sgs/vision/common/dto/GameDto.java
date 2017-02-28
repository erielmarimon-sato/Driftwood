package com.sgs.vision.common.dto;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.sgs.vision.storage.model.Player;

@JsonInclude(Include.NON_NULL)
public class GameDto {
    private String _id;
    private Date date;
    private List<Player> teamOne;
    private List<Player> teamTwo;
    private List<ObjectId> players;
    private Integer teamOneScore;
    private Integer teamTwoScore;
//    private List<ScoreDetails> scores;
    private Player mVP;
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
    public List<Player> getTeamOne() {
        return teamOne;
    }
    public void setTeamOne(List<Player> teamOne) {
        this.teamOne = teamOne;
    }
    public List<Player> getTeamTwo() {
        return teamTwo;
    }
    public void setTeamTwo(List<Player> teamTwo) {
        this.teamTwo = teamTwo;
    }
    public List<ObjectId> getPlayers() {
        return players;
    }
    public void setPlayers(List<ObjectId> players) {
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
    public Player getmVP() {
        return mVP;
    }
    public void setmVP(Player mVP) {
        this.mVP = mVP;
    }
    public String getGameType() {
        return gameType;
    }
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
