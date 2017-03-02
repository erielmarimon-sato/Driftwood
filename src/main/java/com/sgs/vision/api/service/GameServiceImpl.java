package com.sgs.vision.api.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgs.vision.common.dto.GameDto;
import com.sgs.vision.storage.model.Game;
import com.sgs.vision.storage.repository.GameRepository;

@Service
public class GameServiceImpl implements GameService{
    
    @Autowired private GameRepository gameRepository;
    
    @Override
    public Game createGame(String[] playerIds, String gameType) {
        Game newGame = new Game();
        newGame.setDate(new Date());
        newGame.setTeamOne(null);
        newGame.setTeamTwo(null);
        
        List<ObjectId> mPlayerIds = new ArrayList<>();
        for(String p : playerIds){
            mPlayerIds.add(new ObjectId(p));
        }
        newGame.setPlayers(mPlayerIds);
        
        newGame.setTeamOneScore(0);
        newGame.setTeamTwoScore(0);
        newGame.setmVP(null);
        newGame.setGameType(gameType);
        
        return gameRepository.save(newGame);
    }

    @Override
    public List<Game> getGames(Date date) {
        return gameRepository.search(date);
    }

    @Override
    public Game getGame(String gameId) {
        return gameRepository.findById(gameId);
    }
    
    @Override
    public Game addPlayers(String gameId, String[] playerIds) {	
        
        return gameRepository.addPlayersToGame(gameId, playerIds);
    }
    
    @Override
    public Game addPlayersTeamOne(String gameId, String[] playerIds) {
        return gameRepository.addPlayersTeamOne(gameId, playerIds);
    }
    
    @Override
    public Game addPlayersTeamTwo(String gameId, String[] playerIds) {
        return gameRepository.addPlayersTeamTwo(gameId, playerIds);
    }
    
    @Override
    public Game removePlayers(String gameId, String[] playerIds) {
        return gameRepository.removePlayers(gameId, playerIds);
    }

    
    @Override
    public Game removePlayersTeamTwo(String gameId, String[] playerIds) {
        return gameRepository.removePlayersTeamTwo(gameId, playerIds);
    }

    
    @Override
    public Game removePlayersTeamOne(String gameId, String[] playerIds) {
        return gameRepository.removePlayersTeamOne(gameId, playerIds);
    }

    
    @Override
    public Game updateGame(
            String id, 
            Date date, 
            Integer teamOneScore, 
            Integer teamTwoScore, 
            String mVP, 
            String gameType) {
        
        return gameRepository.updateGame(id,date,teamOneScore,
                teamTwoScore,mVP,gameType);
    }

    

}
