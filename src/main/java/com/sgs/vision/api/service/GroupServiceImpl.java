package com.sgs.vision.api.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgs.vision.api.util.Converter;
import com.sgs.vision.common.dto.GroupDto;
import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.storage.model.Group;
import com.sgs.vision.storage.model.Player;
import com.sgs.vision.storage.repository.GroupRepository;
import com.sgs.vision.storage.repository.PlayerRepository;


@Service
public class GroupServiceImpl implements GroupService{
	
	@Autowired private GroupRepository groupRepository;
	
	@Override
	public GroupDto createGroup(String userId, String operationsCenter) {
		Group newGroup = new Group();
		
		Date now = new Date();
		
		List<ObjectId> players = new ArrayList<>();
		players.add(new ObjectId(userId));
		
		newGroup.setAdmin(new ObjectId(userId));
		newGroup.setOperationsCenter(operationsCenter);
		newGroup.setDateCreated(now);
		newGroup.setLastUpdated(now);
		newGroup.setPlayers(players);
		groupRepository.save(newGroup);
		
		return Converter.group(newGroup);
	}

	@Override
	public GroupDto getGroup(String id) {
		return groupRepository.search(id);
	}

	@Override
	public GroupDto addPlayers(String id, String[] playerIds) {
		return Converter.group(groupRepository.addPlayers(id, playerIds));
	}

	@Override
	public List<PlayerDto> getPlayers(String id) {
		List<Player> players = groupRepository.getPlayers(id);
		List<PlayerDto> playersDto = new ArrayList<>();
		for(Player player : players){
			playersDto.add(Converter.player(player));
		}
		
		return playersDto; 
	}
}
