package com.sgs.vision.storage.repository;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.lookup;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.unwind;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.sgs.vision.common.dto.GroupDto;
import com.sgs.vision.storage.model.Game;
import com.sgs.vision.storage.model.Group;
import com.sgs.vision.storage.model.Player;


public class GroupRepositoryImpl implements GroupRepositoryCustom{
	
	@Autowired private MongoTemplate mongoTemplate;
	
	public Group removePlayers(String gameId, String[] playerIds){
		return null;
	}

	@Override
	public GroupDto search(String id) {
		List<AggregationOperation> criteria = new ArrayList<>();
		
		criteria.add(match(Criteria.where("_id").is(new ObjectId(id))));
		TypedAggregation<Group> aggregation = newAggregation(Group.class,criteria);
		AggregationResults<GroupDto> result = mongoTemplate.aggregate(aggregation, GroupDto.class);
		
		return result.getMappedResults().get(0);
	}

	@Override
	public Group addPlayers(String id, String[] playerIds) {
		Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(new ObjectId(id)));
        
        ObjectId[] oIds = new ObjectId[playerIds.length];
        for(int i = 0; i < oIds.length; i++){
            oIds[i] = new ObjectId(playerIds[i]);
        }
        
        Update update = new Update();
        update.pushAll("players", oIds);
        
        Group group = mongoTemplate.findAndModify(
                query, 
                update,
                new FindAndModifyOptions().returnNew(true),
                Group.class);
        
        return group;
	}
	
	public List<Player> getPlayers(String id){
		
		List<AggregationOperation> criteria = new ArrayList<>();
		
		MatchOperation matchOp = match(Criteria.where("groupId").is(new ObjectId(id)));
		
		criteria.add(matchOp);
				
		TypedAggregation<Player> aggregation = newAggregation(Player.class,criteria);
        AggregationResults<Player> result = mongoTemplate.aggregate(aggregation, Player.class);
        
        List<Player> players = result.getMappedResults();
        
        return players;
	}
}
