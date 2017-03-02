package com.sgs.vision.api.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sgs.vision.api.service.GameService;
import com.sgs.vision.api.util.Converter;
import com.sgs.vision.common.dto.JsonResponse;
import com.sgs.vision.storage.model.Game;

@RestController
@RequestMapping("games")
public class GameController {
    @Autowired private GameService gameService;
    
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
    public JsonResponse removePlayers(@RequestParam(required=true) String gameId,
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
    
    @RequestMapping(value = "/players", method = RequestMethod.PUT)
    public JsonResponse addPlayers(@RequestParam(required=true) String gameId,
            @RequestParam(required=true) String[] playerIds) throws Exception{
        
        JsonResponse response = new JsonResponse();
        
        response.setData(Converter.game(
                gameService.addPlayers(gameId, playerIds)));
        
        return response;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public JsonResponse create(@RequestParam(required=true) String[] playerIds,
            @RequestParam(required=false) String gameType) throws Exception{
        
        JsonResponse response = new JsonResponse();
        response.setData(Converter.game(
                gameService.createGame(playerIds, gameType)));
        return response;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public JsonResponse getGames(@RequestParam(required=false) Date date) throws Exception{
        JsonResponse response = new JsonResponse();
        List<Game> games = gameService.getGames(date);
        response.setData(Converter.games(games));
        return response;
    }
}
