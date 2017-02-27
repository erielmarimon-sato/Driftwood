package com.sgs.vision.api.util.converter;

import org.modelmapper.ModelMapper;

import com.sgs.vision.storage.model.User;
import com.sgs.vision.storage.model.history.UserHist;

public class UserConverter {

	public static UserHist convertEntityToHistoryDto(User user){
		ModelMapper mm = new ModelMapper();
		UserHist userHist = mm.map(user, UserHist.class);
		return userHist;
	}
}
