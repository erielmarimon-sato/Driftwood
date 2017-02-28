package com.sgs.vision.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sgs.vision.api.service.GameService;
import com.sgs.vision.api.util.Converter;
import com.sgs.vision.common.dto.JsonResponse;

@RestController
@RequestMapping("games")
public class GameController {
//    @Autowired private GameService gameService;
    
//    public JsonResponse create(@RequestParam(required=true) String[] playerIds,
//            @RequestParam(required=false) String gameType){
//        
//        JsonResponse response = new JsonResponse();
//        response.setData(Converter.game(
//                gameService.createGame(playerIds, gameType)));
//        return response;
//    }
    
}
