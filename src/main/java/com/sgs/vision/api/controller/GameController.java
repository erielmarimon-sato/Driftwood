package com.sgs.vision.api.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.sgs.vision.api.service.GameService;
import com.sgs.vision.api.util.Converter;
import com.sgs.vision.common.dto.JsonResponse;
import com.sgs.vision.storage.model.Game;

@RestController
@RequestMapping("games")
public class GameController {
    @Autowired private GameService gameService;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public JsonResponse update(@PathVariable String id,
            @RequestParam(required = false) Date date,
            @RequestParam(required = false) Integer teamOneScore,
            @RequestParam(required = false) Integer teamTwoScore,
            @RequestParam(required = false) String mVP,
            @RequestParam(required = false) String gameType) throws Exception{
        JsonResponse response = new JsonResponse();
        
        response.setData(Converter.game(
                gameService.updateGame(id,date,teamOneScore,
                        teamTwoScore,mVP,gameType)));
        
        return response;
    }
    
    @RequestMapping(value = "/players/teamTwo", method = RequestMethod.DELETE)
    public JsonResponse removePlayersTeamTwo(@RequestParam(required=true) String gameId,
            @RequestParam(required=true) String[] playerIds) throws Exception{
        
        JsonResponse response = new JsonResponse();
        
        response.setData(Converter.game(
                gameService.removePlayersTeamTwo(gameId, playerIds)));
        
        return response;
    }
    
    @RequestMapping(value = "/players/teamOne", method = RequestMethod.DELETE)
    public JsonResponse removePlayersTeamOne(@RequestParam(required=true) String gameId,
            @RequestParam(required=true) String[] playerIds) throws Exception{
        
        JsonResponse response = new JsonResponse();
        
        response.setData(Converter.game(
                gameService.removePlayersTeamOne(gameId, playerIds)));
        
        return response;
    }
    
    @RequestMapping(value = "/players", method = RequestMethod.DELETE)
    public JsonResponse removePlayers(
    		@RequestParam(required=true) String gameId,
            @RequestParam(required=true) String[] playerIds) throws Exception{
        
        JsonResponse response = new JsonResponse();
        
        response.setData(Converter.game(
                gameService.removePlayers(gameId, playerIds)));
        
        return response;
    }
    
    @RequestMapping(value = "/players/teamTwo", method = RequestMethod.PUT)
    public JsonResponse addPlayersTeamTwo(@RequestParam(required=true) String gameId,
            @RequestParam(required=true) String[] playerIds) throws Exception{
        
        JsonResponse response = new JsonResponse();
        
        response.setData(Converter.game(
                gameService.addPlayersTeamTwo(gameId, playerIds)));
        
        return response;
    }
    
    @RequestMapping(value = "/players/teamOne", method = RequestMethod.PUT)
    public JsonResponse addPlayersTeamOne(@RequestParam(required=true) String gameId,
            @RequestParam(required=true) String[] playerIds) throws Exception{
        
        JsonResponse response = new JsonResponse();
        
        response.setData(Converter.game(
                gameService.addPlayersTeamOne(gameId, playerIds)));
        
        return response;
    }
    
    @RequestMapping(value = "/{id}/players", method = RequestMethod.PUT)
    public JsonResponse addPlayers(@PathVariable(required=true) String id,
            @RequestParam(required=true) String[] playerIds) throws Exception{
        
        JsonResponse response = new JsonResponse();
        
        response.setData(Converter.game(
                gameService.addPlayers(id, playerIds)));
        
        return response;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public JsonResponse create(
    		@RequestParam(required=true) String[] playerIds,
            @RequestParam(required=false) String gameType,
            @RequestParam(required=false) String date,
            @RequestParam(required=false) String time) throws Exception{
        
        JsonResponse response = new JsonResponse();
        response.setData(Converter.game(
                gameService.createGame(playerIds, gameType, date, time)));
        return response;
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public JsonResponse getGame(@PathVariable String id) throws Exception{
        JsonResponse response = new JsonResponse();
        response.setData(Converter.game(gameService.getGame(id)));
        return response;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public JsonResponse getGames(@RequestParam(required=false) Date date) throws Exception{
        JsonResponse response = new JsonResponse();
        List<Game> games = gameService.getGames(date);
        response.setData(Converter.games(games));
        return response;
    }
    
    @RequestMapping(value = "/{id}/players", method = RequestMethod.GET)
    public JsonResponse getGamePlayers(@PathVariable(required=true) String id) 
    		throws JsonParseException, JsonMappingException, IOException, ParseException{
    	JsonResponse response = new JsonResponse();
        response.setData(gameService.getPlayers(id));
        return response;
    }
}
