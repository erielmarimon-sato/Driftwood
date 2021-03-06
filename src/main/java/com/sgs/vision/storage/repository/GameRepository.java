package com.sgs.vision.storage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sgs.vision.storage.model.Game;

public interface GameRepository extends MongoRepository<Game, String>, GameRepositoryCustom{
    Game deleteGameById(String id);
}
