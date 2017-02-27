package com.sgs.vision.api.repository;

public interface TokenRepository {

	/**
	 * @param token 
	 * @param timeout in minutes
	 */
	void save(String token, int timeout);
	
	boolean exist(String token);
	
	void remove(String token);
	
}
