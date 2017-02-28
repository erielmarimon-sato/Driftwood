package com.sgs.vision.storage.repository;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.sgs.vision.api.util.Converter;
import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.storage.model.Player;

public class PlayerRepositoryImpl implements PlayerRepositoryCustom{
    
    @Autowired private MongoTemplate mongoTemplate;
    
    private static Logger logger = LogManager.getLogger(PlayerRepositoryImpl.class.getName());
    
    @Override
    public PlayerDto findByPlayerId(String id) {
        List<AggregationOperation> criteria = new ArrayList<>();
        MatchOperation issueMatch = match (Criteria.where("_id").is(new ObjectId(id)));
        criteria.add(issueMatch);
        TypedAggregation<Player> aggregation = newAggregation(Player.class,criteria);
        AggregationResults<PlayerDto> result = mongoTemplate.aggregate(aggregation, PlayerDto.class);
        return result.getUniqueMappedResult();
        
    }

    @Override
    public List<PlayerDto> search(boolean active) {
        List<AggregationOperation> criteria = new ArrayList<>();
        
        criteria.add(match(Criteria.where("active").is(active)));
        
        TypedAggregation<Player> aggregation = newAggregation(Player.class,criteria);
        AggregationResults<PlayerDto> result = mongoTemplate.aggregate(aggregation, PlayerDto.class);
        return result.getMappedResults();
    }

    @Override
    public Player updatePlayer(
            String id, 
            String name, 
            String username, 
            String totalGoals, 
            String assists,
            String totalGames, 
            String effectiveness, 
            String lastDayPlayed) {
        
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(new ObjectId(id)));
        
        Update update = new Update();
        
        if(name != null){update.set("name", name);}
        if(username != null){update.set("username", username);}
        if(totalGoals != null){update.set("totalGoals", totalGoals);}
        if(assists != null){update.set("assists", assists);}
        if(totalGames != null){update.set("totalGames", totalGames);}
        if(effectiveness != null){update.set("effectiveness", effectiveness);}
        if(lastDayPlayed != null){update.set("lastDayPlayed", lastDayPlayed);}
        
        Player player = mongoTemplate.findAndModify(
                query, 
                update, 
                new FindAndModifyOptions().returnNew(true), 
                Player.class);
        
        System.out.println("Finish update for " + player.getUsername());
        
        return player;
    }
    
    

}
