package com.sgs.vision.storage.repository;

import java.util.Date;
import java.util.List;

import com.sgs.vision.common.dto.GameDto;
import com.sgs.vision.storage.model.Game;

public interface GameRepositoryCustom {
    GameDto findById(String id);
    
    List<Game> search(Date date);
}
