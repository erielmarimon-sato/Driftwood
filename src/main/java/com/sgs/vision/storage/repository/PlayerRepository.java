package com.sgs.vision.storage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.storage.model.Player;

public interface PlayerRepository extends MongoRepository<Player, String>, PlayerRepositoryCustom{
    PlayerDto findByUsername(String username);
    
    PlayerDto findByUsernameAndPassword(String username, String password);
}
