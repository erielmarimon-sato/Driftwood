package com.sgs.vision.api.service;

import java.util.List;

import com.sgs.vision.common.dto.GroupDto;
import com.sgs.vision.common.dto.PlayerDto;

public interface GroupService {

	GroupDto createGroup(String userId, String operationsCenter);

	GroupDto getGroup(String groupId);

	GroupDto addPlayers(String id, String[] playerIds);

	List<PlayerDto> getPlayers(String id);

}
