package com.sgs.vision.api.util;

import com.sgs.vision.common.dto.GameDto;
import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.storage.model.Game;
import com.sgs.vision.storage.model.Player;
import org.modelmapper.ModelMapper;

public class Converter {

    public static PlayerDto player(Player createdPlayer) {
        
        PlayerDto player = new PlayerDto();
        
        ModelMapper mp = new ModelMapper();
        
        player = mp.map(createdPlayer, PlayerDto.class);
        
//        player.set_id(createdPlayer.getId());
//        player.setName(createdPlayer.getName());
//        player.setUsername(createdPlayer.getUsername());
//        player.setTotalGoals(createdPlayer.getTotalGoals());
//        player.setTotalAssists(createdPlayer.getTotalAssists());
//        player.setTotalGames(createdPlayer.getTotalGames());
//        player.setEffectiveness(createdPlayer.getEffectiveness());
//        player.setPlayingSince(createdPlayer.getPlayingSince());
//        player.setLastDayPlayed(createdPlayer.getLastDayPlayed());
//        player.setActive(createdPlayer.getActive());
        return player;
    }

//    public static GameDto game(Game createGame) {
//        GameDto game = new GameDto();
//        game.set_id(createGame.getId());
//        game.setDate(createGame.getDate());
//        game.setPlayers(createGame.getPlayers());
//        game.setTeamOneScore(createGame.getTeamOneScore());
//        game.setTeamTwoScore(createGame.getTeamTwoScore());
////        game.setScores(createGame.getScores());
//        game.setGameType(createGame.getGameType());
//        
//        game.setmVP(createGame.getmVP());
//        game.setTeamOne(createGame.getTeamOne());
//        game.setTeamTwo(createGame.getTeamTwo());
//        return game;
//    }
}
