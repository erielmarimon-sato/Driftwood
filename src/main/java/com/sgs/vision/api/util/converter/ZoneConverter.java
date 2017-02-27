package com.sgs.vision.api.util.converter;

import org.modelmapper.ModelMapper;

import com.sgs.vision.storage.model.Zone;
import com.sgs.vision.storage.model.history.ZoneHist;

public class ZoneConverter {

	public static ZoneHist convertEntityToHistoryDto(Zone zone){
		if(zone == null) return null;
		ModelMapper mm = new ModelMapper();
		ZoneHist zoneHistory = mm.map(zone, ZoneHist.class);
		return zoneHistory;
	}
		
	
}
