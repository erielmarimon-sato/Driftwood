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
		
		ModelMapper mp = new ModelMapper();
		
		GroupDto dto = mp.map(group, GroupDto.class);
		
		return dto;
	}
	
    public static PlayerDto player(Player createdPlayer) {
   	     
        ModelMapper mp = new ModelMapper();

        PlayerDto player = mp.map(createdPlayer, PlayerDto.class);

        return player;
    }

    public static GameDto game(Game createGame) throws Exception {
        
        ModelMapper mp = new ModelMapper();
        GameDto game = mp.map(createGame, GameDto.class);
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
