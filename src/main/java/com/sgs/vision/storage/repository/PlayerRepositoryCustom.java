package com.sgs.vision.storage.repository;

import java.util.List;

import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.storage.model.Player;

public interface PlayerRepositoryCustom {
    PlayerDto findByPlayerId(String id);
    
    List<PlayerDto> search(boolean active);
    
    Player updatePlayer(String id, String name, String username, String totalGoals, String assists,
            String totalGames, String effectiveness, String lastDayPlayed);
}
