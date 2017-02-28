package com.sgs.vision.api.service;

import java.util.Date;
import java.util.List;

import com.sgs.vision.common.dto.GameDto;
import com.sgs.vision.storage.model.Game;

public interface GameService {

    Game createGame(String[] playerIds, String gameType);

    List<Game> getGames(Date date);

}
