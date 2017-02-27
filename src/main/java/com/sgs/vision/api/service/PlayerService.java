package com.sgs.vision.api.service;

import java.util.List;

import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.common.exceptions.DuplicatedUserException;
import com.sgs.vision.storage.model.Player;

public interface PlayerService {
    
    // TODO: New exception should be used instead of DuplicatedUserException
    Player createPlayer(String name, String username, String password) 
            throws DuplicatedUserException;

    List<PlayerDto> getPlayers(boolean active);

    PlayerDto getPlayer(String id) throws Exception;

    Player updatePlayer(
            String id, String name, String username, String totalGoals, 
            String assists, String totalGames, String effectiveness, 
            String lastDayPlayed);
    
    
}
