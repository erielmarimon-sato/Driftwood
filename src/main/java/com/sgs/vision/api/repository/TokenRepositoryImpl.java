package com.sgs.vision.api.repository;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
public class TokenRepositoryImpl implements TokenRepository {
	
	private static final String NAMESPACE = "access_token_hash";
	
	@Autowired 
	private RedisTemplate<String, Boolean> redisTemplate;

	@Override
	public void save(String token, int timeout) {
		ValueOperations<String, Boolean> vo = redisTemplate.opsForValue();
		String key = getKey(token);
		vo.set(key, true, timeout, TimeUnit.MINUTES);
	}

	@Override
	public boolean exist(String token) {
		ValueOperations<String, Boolean> vo = redisTemplate.opsForValue();
		String key = getKey(token);
		return vo.get(key) ? Boolean.TRUE : Boolean.FALSE;
	}

	@Override
	public void remove(String token) {
		String key = NAMESPACE + "_" + token;
		redisTemplate.delete(key);
	}
	
	private String getKey(String token){
		return NAMESPACE + "_" + token;
	}

}
