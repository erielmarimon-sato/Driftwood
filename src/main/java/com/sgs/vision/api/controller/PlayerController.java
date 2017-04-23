package com.sgs.vision.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sgs.vision.api.service.PlayerService;
import com.sgs.vision.api.util.Converter;
import com.sgs.vision.common.dto.JsonResponse;
import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.common.exceptions.DuplicatedUserException;

@RestController
@RequestMapping("players")
public class PlayerController {
    
    @Autowired private PlayerService playerService;
    
    @RequestMapping(method = RequestMethod.PUT)
    public JsonResponse update(
            @RequestParam(required=true) String id,
            @RequestParam(required=false) String name,
            @RequestParam(required=false) String username,
            @RequestParam(required=false) String groupId,
            @RequestParam(required=false) String totalGoals,
            @RequestParam(required=false) String assists,
            @RequestParam(required=false) String totalGames,
            @RequestParam(required=false) String effectiveness,
            @RequestParam(required=false) String lastDayPlayed){
        
        JsonResponse response = new JsonResponse();
        response.setData(Converter.player(playerService.updatePlayer(id, name, username, 
        		groupId, totalGoals, assists, totalGames, effectiveness, lastDayPlayed)));
        return response;
    }
    
    /**
     * Creates a player. Set to active by default and grounded stats.
     * @param name Name of the player
     * @param username to be identified with
     * @param password to log in
     * @return the newly created player's id, name, and username
     * @throws DuplicatedUserException
     */
    @RequestMapping(method = RequestMethod.POST)
    public JsonResponse create(@RequestParam(required=true) String name,
                       @RequestParam(required=true) String username,
                       @RequestParam(required=true) String password)
                               throws DuplicatedUserException{
        JsonResponse response = new JsonResponse();
        response.setData(Converter.player(
                playerService.createPlayer(name, username, password)));
        return response;
        
    }
    
    /**
     * Gets a list of all the players with the specified filters.
     * @param active is the player set as active or not
     * @return a list of players
     */
    @RequestMapping(method = RequestMethod.GET)
    public JsonResponse search(
    		@RequestParam(required=false) String name,
    		@RequestParam(required=false) String username,
    		@RequestParam(required=false) String groupId,
    		@RequestParam(required=true, defaultValue="true") boolean active){
    		
    		System.out.println(name);
    	
	        JsonResponse response = new JsonResponse();
	        List<PlayerDto> players = playerService.search(name, username, groupId, active);
	        
	        response.setData(players);
	        
	        return response;
    }
    
    /**
     * Gets a player by id
     * @param id the player's id
     * @return the whole player object
     * @throws Exception
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public JsonResponse getPlayer(@PathVariable String id) throws Exception{
        JsonResponse response = new JsonResponse();
        response.setData(playerService.getPlayer(id));
        return response;
    }
    
    
}
