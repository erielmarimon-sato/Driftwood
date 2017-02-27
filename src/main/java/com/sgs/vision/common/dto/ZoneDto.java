package com.sgs.vision.common.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ZoneDto {

	private String id;
	private String name;
	private String description;
	private String typeName;
	private Long itemsCount;
	private Long readPointCount;
	private String typeDesc;
	private String zoneType;
	
	List<ReadPointDto> readPointDtos;
	
	public ZoneDto(){
		
	}
	
	public ZoneDto(String id, String name, String description, String typeName, Long itemsCount) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.typeName = typeName;
		this.itemsCount = itemsCount;
	}

	public ZoneDto(String id, String name, String description, String typeName, String typeDesc, Long readPointCount) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.typeName = typeName;
		this.typeDesc = typeDesc;
		this.readPointCount = readPointCount;
	}
	
	public ZoneDto(String id, String name, String description, String typeName, String typeDesc, String zoneType) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.zoneType = zoneType;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Long getItemsCount() {
		return itemsCount;
	}

	public void setItemsCount(Long itemsCount) {
		this.itemsCount = itemsCount;
	}

	public Long getReadPointCount() {
		return readPointCount;
	}

	public void setReadPointCount(Long readPointCount) {
		this.readPointCount = readPointCount;
	}

	public String getTypeDesc() {
		return typeDesc;
	}

	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	public List<ReadPointDto> getReadPointDtos() {
		return readPointDtos;
	}

	public void setReadPointDtos(List<ReadPointDto> readPointDtos) {
		this.readPointDtos = readPointDtos;
	}

	public String getZoneType() {
		return zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}
	
}
