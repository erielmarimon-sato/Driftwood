package com.sgs.vision.api.util;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONObject;
import org.modelmapper.ModelMapper;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.DBObject;
import com.sgs.vision.common.dto.GameDto;
import com.sgs.vision.common.dto.GroupDto;
import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.storage.model.Game;
import com.sgs.vision.storage.model.Group;
import com.sgs.vision.storage.model.Player;



public class Converter {
    
	private final static String PLAYER_KEY = "player";
	private final static String SERIAL_ID_KEY = "_id";
	private final static String SERIAL_OBJECT_ID_KEY = "$oid";
	private final static String GROUP_ID_KEY = "groupId";
	
	private final static String DATE_FORMAT_STRING = "YYYY-mm-dd'T'hh:mm:ss.SSS'Z'";
	
	private final static DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_STRING);
	
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

    public static PlayerDto player(DBObject object) 
    		throws JsonParseException, JsonMappingException, IOException, ParseException{
    	
    	ObjectMapper mapper = new ObjectMapper();
    	mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    	
    	JSONObject playerJson = new JSONObject(object.get(PLAYER_KEY).toString());
    	playerJson.put(SERIAL_ID_KEY, playerJson.getJSONObject(SERIAL_ID_KEY).getString(SERIAL_OBJECT_ID_KEY));
    	
    	if(playerJson.has(GROUP_ID_KEY)){
    		playerJson.put(GROUP_ID_KEY, playerJson.getJSONObject(GROUP_ID_KEY).getString(SERIAL_OBJECT_ID_KEY));
    	}
    	
    	String dateString = playerJson.getJSONObject("playingSince").getString("$date");
    	Date date = dateFormat.parse(dateString);
    	long unixTime = (long) date.getTime()/1000;
    	playerJson.put("playingSince", unixTime);
    	
    	dateString = playerJson.getJSONObject("lastDayPlayed").getString("$date");
    	date = dateFormat.parse(dateString);
    	unixTime = (long) date.getTime()/1000;
    	playerJson.put("lastDayPlayed", unixTime);
    	
    	String playerJsonString = playerJson.toString();
    	
    	System.out.println(playerJsonString);
    	
    	PlayerDto player = mapper.readValue(playerJsonString, PlayerDto.class);
    	
		return player;
    }
    
    public static Player playerObject(DBObject object) 
    		throws JsonParseException, JsonMappingException, IOException{
    	
    	ObjectMapper mapper = new ObjectMapper();
    	mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    	
    	String playerJsonString = object.get("player").toString();
    	
    	Player player = mapper.readValue(playerJsonString, Player.class);
    	
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
