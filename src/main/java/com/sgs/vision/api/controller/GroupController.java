package com.sgs.vision.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sgs.vision.api.service.GroupService;
import com.sgs.vision.common.dto.JsonResponse;
import com.sgs.vision.common.dto.PlayerDto;


@RestController
@RequestMapping("groups")
public class GroupController {

	@Autowired private GroupService groupService;
    
	@RequestMapping(method = RequestMethod.POST)
    public JsonResponse create(
    		@RequestParam(required=true) String userId,
    		@RequestParam(required=false) String operationsCenter){
    	JsonResponse response = new JsonResponse();
    	response.setData(groupService.createGroup(userId, operationsCenter));
    	return response;
    }
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
    public JsonResponse search(@PathVariable String id){
		
		System.out.println("THE ID: " + id);
		
    	JsonResponse response = new JsonResponse();
    	response.setData(groupService.getGroup(id));
    	return response;
    }
    
	@RequestMapping(value="/groups/{id}", method=RequestMethod.PUT)
	public JsonResponse addPlayer(
			@PathVariable String id,
			@RequestParam(required=true) String[] playerIds){
		JsonResponse response = new JsonResponse();
		
		response.setData(groupService.addPlayers(id, playerIds));
		
		return response;
	}
	
	@RequestMapping(value="/{id}/players", method=RequestMethod.GET)
    public JsonResponse getPlayers(@PathVariable String id){
		JsonResponse response = new JsonResponse();
		
		List<PlayerDto> dtos = groupService.getPlayers(id);
		
		response.setData(dtos);
		
		return response;
	}
}
