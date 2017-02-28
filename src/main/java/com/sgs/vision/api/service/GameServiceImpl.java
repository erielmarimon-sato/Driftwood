//package com.sgs.vision.api.service;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.sgs.vision.storage.model.Game;
//import com.sgs.vision.storage.repository.GameRepository;
//
//public class GameServiceImpl implements GameService{
//    
//    @Autowired private GameRepository gameRepository;
//    
//    @Override
//    public Game createGame(String[] playerIds, String gameType) {
//        Game newGame = new Game();
//        newGame.setDate(new Date());
//        newGame.setGameType(gameType);
//        List<ObjectId> players = new ArrayList<>();
//        for(String playerId : playerIds){
//            players.add(new ObjectId(playerId));
//        }
//        newGame.setPlayers(players);
//        
//        return gameRepository.save(newGame);
//    }
//
//}
