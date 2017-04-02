package com.sgs.vision.storage.repository;


import java.util.List;

import com.sgs.vision.storage.model.Group;
import com.sgs.vision.storage.model.Player;

public interface GroupRepositoryCustom {
	Group removePlayers(String gameId, String[] playerIds);
	
	Group search(String id);
	
	Group addPlayers(String id, String[] playerIds);
	
	List<Player> getPlayers(String id);
}
