package com.sgs.vision.api.util.converter;

import org.modelmapper.ModelMapper;

import com.sgs.vision.common.dto.ItemDto;
import com.sgs.vision.storage.model.Item;
import com.sgs.vision.storage.model.history.ItemHist;

public class ItemConverter {

	public static Item convertDtoToEntity(ItemDto itemDto){
		ModelMapper mm = new ModelMapper();
		Item item = mm.map(itemDto, Item.class);
		return item;
	}
	
	public static ItemHist convertDtoToHistoryDto(ItemDto itemDto){
		ModelMapper mm = new ModelMapper();
		ItemHist item = mm.map(itemDto, ItemHist.class);
		return item;
	}
	
	public static ItemHist convertItemToHistory(Item item){
		if(item == null ) return null;
		ModelMapper mm = new ModelMapper();
		ItemHist hist = mm.map(item, ItemHist.class);
		return hist;
	}
	
	
}
