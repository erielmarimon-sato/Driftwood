package com.sgs.vision.api.util.converter;

import org.modelmapper.ModelMapper;

import com.sgs.vision.storage.model.ReadPoint;
import com.sgs.vision.storage.model.history.ReadPointHist;

public class ReadPointConverter {

	public static ReadPointHist convertEntityToHistoryDto(ReadPoint readPoint){
		if(readPoint == null) return null;
		ModelMapper mm = new ModelMapper();
		ReadPointHist readPointHistory = mm.map(readPoint, ReadPointHist.class);
		return readPointHistory;
	}
		
	
}
