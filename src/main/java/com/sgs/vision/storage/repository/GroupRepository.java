package com.sgs.vision.storage.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sgs.vision.common.dto.GroupDto;
import com.sgs.vision.storage.model.Group;
import com.sgs.vision.storage.model.Player;


public interface GroupRepository extends MongoRepository<Group, String>, GroupRepositoryCustom{
	Group findById(String id);
}
