package com.sgs.vision.common.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserLoginDto {

	private String userId;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String accessToken;
	private String refreshToken;
	private List<String> topics;
	private BaseUrl baseUrl;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String idUser) {
		this.userId = idUser;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getTopics() {
		return topics;
	}
	
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public BaseUrl getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(BaseUrl baseUrl) {
		this.baseUrl = baseUrl;
	}

	public static class BaseUrl{
		
		private String skusImageUrl;
		private String swatchesImageUrl;
		private String profilesImageUrl;
		private String inventoryLogUrl;
		
		public String getSkusImageUrl() {
			return skusImageUrl;
		}
		
		public void setSkusImageUrl(String skusImageUrl) {
			this.skusImageUrl = skusImageUrl;
		}
		
		public String getSwatchesImageUrl() {
			return swatchesImageUrl;
		}
		
		public void setSwatchesImageUrl(String swatchesImageUrl) {
			this.swatchesImageUrl = swatchesImageUrl;
		}
		
		public String getProfilesImageUrl() {
			return profilesImageUrl;
		}
		
		public void setProfilesImageUrl(String profilesImageUrl) {
			this.profilesImageUrl = profilesImageUrl;
		}

		public String getInventoryLogUrl() {
			return inventoryLogUrl;
		}

		public void setInventoryLogUrl(String inventoryLogUrl) {
			this.inventoryLogUrl = inventoryLogUrl;
		}
		
	}
	
}
