package com.sgs.vision.storage.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="games")
public class Game {
    @Id
    private ObjectId id;
    private Date date;
    private List<ObjectId> teamOne;
    private List<ObjectId> teamTwo;
    private List<ObjectId> players;
    private Integer teamOneScore;
    private Integer teamTwoScore;
//    private List<ScoreDetails> details; // a class for the details of the score
    private ObjectId mVP;
    private String gameType;
    
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public List<ObjectId> getTeamOne() {
        return teamOne;
    }
    public void setTeamOne(List<ObjectId> teamOne) {
        this.teamOne = teamOne;
    }
    public List<ObjectId> getTeamTwo() {
        return teamTwo;
    }
    public void setTeamTwo(List<ObjectId> teamTwo) {
        this.teamTwo = teamTwo;
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
    public ObjectId getmVP() {
        return mVP;
    }
    public void setmVP(ObjectId mVP) {
        this.mVP = mVP;
    }
    public List<ObjectId> getPlayers() {
        return players;
    }
    public void setPlayers(List<ObjectId> players) {
        this.players = players;
    }
    public String getGameType() {
        return gameType;
    }
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }
}
