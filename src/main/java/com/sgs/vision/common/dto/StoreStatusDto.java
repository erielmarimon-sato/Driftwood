package com.sgs.vision.common.dto;

import java.util.List;

public class StoreStatusDto {

	private String priority;
	private Integer count;
	private List<TypeStatus> typeStatusList;
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<TypeStatus> getTypeStatusList() {
		return typeStatusList;
	}

	public void setTypeStatusList(List<TypeStatus> typeStatusList) {
		this.typeStatusList = typeStatusList;
	}



	public static class TypeStatus{
		
		private String type;
		private Long count;
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Long getCount() {
			return count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		
	}
}
