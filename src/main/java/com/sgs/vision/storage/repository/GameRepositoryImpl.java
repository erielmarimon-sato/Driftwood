package com.sgs.vision.storage.repository;


import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.data.mongodb.core.query.Criteria;

import com.sgs.vision.common.dto.GameDto;
import com.sgs.vision.common.dto.PlayerDto;
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

}
