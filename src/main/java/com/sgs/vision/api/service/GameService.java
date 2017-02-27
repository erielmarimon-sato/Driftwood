package com.sgs.vision.api.service;

import com.sgs.vision.storage.model.Game;

public interface GameService {

    Game createGame(String[] playerIds, String gameType);

}
