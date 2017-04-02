package com.sgs.vision.api.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.sgs.vision.api.service.PlayerService;
import com.sgs.vision.common.dto.GameDto;
import com.sgs.vision.common.dto.GroupDto;
import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.storage.model.Game;
import com.sgs.vision.storage.model.Group;
import com.sgs.vision.storage.model.Player;

public class Converter {
    
	public static GroupDto group(Group group){
		GroupDto dto = new GroupDto();
		dto.set_id(group.getId().toString());
		dto.setAdmin(group.getAdmin().toString());
		dto.setDateCreated(group.getDateCreated());
		dto.setLastUpdated(group.getLastUpdated());
		dto.setOperationsCenter(group.getOperationsCenter());
		
		List<String> playerIds = new ArrayList<>();
		
		for(ObjectId id : group.getPlayers()){
			playerIds.add(id.toString());
		}
		
		dto.setPlayers(playerIds);
		return dto;
	}
	
    public static PlayerDto player(Player createdPlayer) {
        
        PlayerDto player = new PlayerDto();
        
//        ModelMapper mp = new ModelMapper();
        
        player.set_id(createdPlayer.getId());
        player.setName(createdPlayer.getName());
        player.setUsername(createdPlayer.getUsername());
        player.setTotalGoals(createdPlayer.getTotalGoals());
        player.setTotalAssists(createdPlayer.getTotalAssists());
        player.setTotalGames(createdPlayer.getTotalGames());
        player.setEffectiveness(createdPlayer.getEffectiveness());
        player.setPlayingSince(createdPlayer.getPlayingSince());
        player.setLastDayPlayed(createdPlayer.getLastDayPlayed());
        player.setActive(createdPlayer.getActive());
        player.setGroupId(createdPlayer.getGroup());
        return player;
    }

    public static GameDto game(Game createGame) throws Exception {
        
        GameDto game = new GameDto();
        
        game.set_id(createGame.getId());
        game.setDate(createGame.getDate());
        // set team one
        if(createGame.getTeamOne() != null){
            // extracts propertie from a list into another list
            // ObjectId -> original list type
            // toString -> what to extract from ObjectId (value of the toString method)
            // collect() -> says what to do with the mapped data
            game.setTeamOne(
                    createGame.getTeamOne().stream()
                    .map(ObjectId::toString).collect(Collectors.toList()));
        }
        
        // set team two
        if(createGame.getTeamTwo() != null){
            game.setTeamTwo(
                    createGame.getTeamTwo().stream()
                    .map(ObjectId::toString).collect(Collectors.toList()));
        }
        
        // set players
        List<String> mPlayers = new ArrayList<>();
        for(ObjectId oId : createGame.getPlayers()){
            mPlayers.add(oId.toString());
        }
        game.setPlayers(mPlayers);
        
        game.setTeamOneScore(createGame.getTeamOneScore());
        game.setTeamTwoScore(createGame.getTeamTwoScore());
        
        if(createGame.getmVP() != null){
            game.setmVP(createGame.getmVP().toString());
        }
        
        game.setGameType(createGame.getGameType());
        
        return game;
    }

    public static List<GameDto> games(List<Game> games) throws Exception {
        List<GameDto> mGames = new ArrayList<>();
        for(Game g : games){
            mGames.add(game(g));
        }
        return mGames;
    }
}
