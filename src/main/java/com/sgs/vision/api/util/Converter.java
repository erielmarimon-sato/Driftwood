package com.sgs.vision.api.util;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.sgs.vision.common.constants.ZoneTypeEnum;
import com.sgs.vision.common.dto.DeviceDto;
import com.sgs.vision.common.dto.InventorySkuDto;
import com.sgs.vision.common.dto.JobStatusDto;
import com.sgs.vision.common.dto.LocationDto;
import com.sgs.vision.common.dto.OrganizationDto;
import com.sgs.vision.common.dto.PlayerDto;
import com.sgs.vision.common.dto.ReadPointDto;
import com.sgs.vision.common.dto.ZoneDto;
import com.sgs.vision.common.dto.ZoneTypeDto;
import com.sgs.vision.storage.model.Device;
import com.sgs.vision.storage.model.InventorySku;
import com.sgs.vision.storage.model.InventorySkuHistory;
import com.sgs.vision.storage.model.JobStatus;
import com.sgs.vision.storage.model.Location;
import com.sgs.vision.storage.model.Organization;
import com.sgs.vision.storage.model.Player;
import com.sgs.vision.storage.model.ReadPoint;
import com.sgs.vision.storage.model.Zone;

public class Converter {
	
	
	public static InventorySkuDto convert(InventorySku from){
		ModelMapper mp = new ModelMapper();
		InventorySkuDto skuDto  = mp.map(from, InventorySkuDto.class);
		return skuDto;
	}
	
	public static List<InventorySkuDto> skus(List<InventorySku> fromData){
		List<InventorySkuDto> dtos = new ArrayList<>();
		ModelMapper mp = new ModelMapper();
		fromData.forEach(from->{
			InventorySkuDto skuDto  = mp.map(from, InventorySkuDto.class);
			dtos.add(skuDto);
		});

		return dtos;
	}
	
	public static List<DeviceDto> devices(List<Device> fromData){
		List<DeviceDto> toData = new ArrayList<>();
		ModelMapper mp = new ModelMapper();
		fromData.forEach(from->{
			DeviceDto to = mp.map(from, DeviceDto.class);
			toData.add(to);
		});
		return toData;
	}
	
	public static DeviceDto device(Device from){

		ModelMapper mp = new ModelMapper();
		DeviceDto dto = mp.map(from, DeviceDto.class);
		return dto;
	}
	
	public static List<ZoneDto> zones(List<Zone> fromData){
		List<ZoneDto> toData = new ArrayList<>();
		ModelMapper mp = new ModelMapper();
		fromData.forEach(from->{
			ZoneDto to = mp.map(from, ZoneDto.class);
			toData.add(to);
		});
		return toData;
	}
	
	public static ZoneDto zone(Zone fromData){
		ModelMapper mp = new ModelMapper();
		return mp.map(fromData, ZoneDto.class);
	}
	
	public static ZoneDto addReadPointToZoneDto(Zone from, List<ReadPoint> list){
		List<ReadPointDto> readPoints = new ArrayList<>();
		ModelMapper mp = new ModelMapper();
		ZoneDto dto = mp.map(from, ZoneDto.class);
		list.forEach(rp -> {
			ReadPointDto rpDto = mp.map(rp, ReadPointDto.class);
			readPoints.add(rpDto);
		});
		dto.setReadPointDtos(readPoints);
		return dto;
	}

	/**
	 * @param list
	 * @return
	 */
	
	public static List<ReadPointDto> readPoints(List<ReadPoint> list){
		List<ReadPointDto> readPoints = new ArrayList<>();
		ModelMapper mp = new ModelMapper();
		list.forEach(rp -> {
			ReadPointDto dto = mp.map(rp, ReadPointDto.class);
			if(rp.getZoneId() != null){
				//dto.setZoneDto(zone(rp.getZone()));
			}
			readPoints.add(dto);
		});
		return readPoints;
	}
	
	/**
	 * @param list
	 * @return
	 */
	public static ReadPointDto readPoint(ReadPoint rp){
		ModelMapper mp = new ModelMapper();
		ReadPointDto dto = mp.map(rp, ReadPointDto.class);
		return dto;
	}
	
	public static List<LocationDto> locations(List<Location> list){
		List<LocationDto> locations = new ArrayList<>();
		ModelMapper mp = new ModelMapper();
		for (Location l : list){
			LocationDto dto = mp.map(l, LocationDto.class);
			locations.add(dto);
		}
		return locations;
	}
	
	
	public static LocationDto location(Location from){
		ModelMapper mp = new ModelMapper();
		LocationDto dto = mp.map(from, LocationDto.class);
		return dto;
	}
	
	public static List<OrganizationDto> organizations(List<Organization> list){
		List<OrganizationDto> org = new ArrayList<>();
		ModelMapper mp = new ModelMapper();
		for (Organization l : list){
			OrganizationDto dto = mp.map(l, OrganizationDto.class);
			org.add(dto);
		}
		return org;
	}
	
	public static OrganizationDto organization(Organization from){
		ModelMapper mp = new ModelMapper();
		OrganizationDto dto = mp.map(from, OrganizationDto.class);
		return dto;
	}
	
	private static void updateLogURL(String logFileHost, JobStatusDto jobStatusDto){
		if(logFileHost != null ){
			jobStatusDto.setLogFile(logFileHost+""+jobStatusDto.getLogFile());
		}
	}
		
	public static List<JobStatusDto> jobStatusEntitiesToDtos(List<JobStatus> list, String logFileHost){
		List<JobStatusDto> jobStatusDtos = new ArrayList<>();
		ModelMapper mp = new ModelMapper();
		for (JobStatus e : list){
			JobStatusDto jobStatusDto = mp.map(e, JobStatusDto.class);
			updateLogURL(logFileHost,jobStatusDto);
			jobStatusDtos.add(jobStatusDto);
		}
		return jobStatusDtos;
	}
	
	public static JobStatusDto jobStatusEntityToDto(JobStatus jobStatus, String logFileHost){
		ModelMapper mp = new ModelMapper();
		JobStatusDto jobStatusDto = mp.map(jobStatus, JobStatusDto.class);
		updateLogURL(logFileHost,jobStatusDto);
		return jobStatusDto;
	}
	
	public static List<ZoneTypeDto> zoneTypes() {
		List<ZoneTypeDto> zoneTypes = new ArrayList<>();
		ZoneTypeEnum[] types = ZoneTypeEnum.values();
		for(ZoneTypeEnum type: types){
			ZoneTypeDto dto = new ZoneTypeDto();
			dto.setName(type.name().toLowerCase());
			dto.setDescription(type.name().toLowerCase());
			zoneTypes.add(dto);
		}
		return zoneTypes;
	}
	
	public static InventorySkuHistory formatSkuHistory(InventorySku sku){
		ModelMapper mp = new ModelMapper();
		InventorySkuHistory history = mp.map(sku, InventorySkuHistory.class);
		history.setSkuId(sku.getId());
		history.setId(null);
		return history;
	}

    public static PlayerDto player(Player createdPlayer) {
        PlayerDto player = new PlayerDto();
        player.set_id(createdPlayer.getId());
        player.setName(createdPlayer.getName());
        player.setUsername(createdPlayer.getUsername());
        player.setTotalGoals(createdPlayer.getTotalGoals());
        player.setTotalAssists(createdPlayer.getTotalAssists());
        player.setTotalGames(createdPlayer.getTotalGames());
        player.setEffectiveness(createdPlayer.getEffectiveness());
        player.setPlayingSince(createdPlayer.getPlayingSince());
        player.setLastDayPlayed(createdPlayer.getLastDayPlayed());
        player.setActive(createdPlayer.getActive());
        
        return player;
    }
}
