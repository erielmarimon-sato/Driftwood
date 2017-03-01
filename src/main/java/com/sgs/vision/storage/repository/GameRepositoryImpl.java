package com.sgs.vision.storage.repository;


import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.sgs.vision.common.dto.GameDto;
import com.sgs.vision.storage.model.Game;

public class GameRepositoryImpl implements GameRepositoryCustom{
    
    @Autowired private MongoTemplate mongoTemplate;
    
    @Override
    public GameDto findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Game> search(Date date) {
        List<AggregationOperation> criteria = new ArrayList<>();
        if(date != null){
            criteria.add(match(Criteria.where("date").is(date)));
        }else{
            criteria.add(match(new Criteria()));
        }
        
        TypedAggregation<Game> aggregation = newAggregation(Game.class,criteria);
        AggregationResults<Game> result = mongoTemplate.aggregate(aggregation, Game.class);
        return result.getMappedResults();
    }

    @Override
    public Game addPlayersToGame(String gameId, String[] playerIds) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(new ObjectId(gameId)));
        
        Update update = new Update();
        update.pushAll("players", playerIds);
        
        Game game = mongoTemplate.findAndModify(
                query, 
                update,
                new FindAndModifyOptions().returnNew(true),
                Game.class);
        
        return game;
    }
}
