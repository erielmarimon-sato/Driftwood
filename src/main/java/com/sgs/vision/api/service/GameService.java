package com.sgs.vision.api.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.sgs.vision.common.dto.GameDto;
import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.storage.model.Game;

public interface GameService {

    Game createGame(String[] playerIds, String gameType, String date, String time) throws ParseException;

    List<Game> getGames(Date date);

    Game getGame(String gameId);
    
    Game addPlayers(String gameId, String[] playerIds);

    Game addPlayersTeamOne(String gameId, String[] playerIds);
    
    Game addPlayersTeamTwo(String gameId, String[] playerIds);

    Game removePlayers(String gameId, String[] playerIds);

    Game removePlayersTeamTwo(String gameId, String[] playerIds);

    Game removePlayersTeamOne(String gameId, String[] playerIds);

    Game updateGame(String id, Date date, Integer teamOneScore,
            Integer teamTwoScore, String mVP, String gameType);

	List<PlayerDto> getPlayers(String gameId) 
			throws JsonParseException, JsonMappingException, IOException, ParseException;

}
