package com.sgs.vision.api.security;

import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

import javax.crypto.Cipher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sgs.vision.api.repository.TokenRepository;
import com.sgs.vision.common.exceptions.ExpiredTokenException;
import com.sgs.vision.common.exceptions.KeyStoreException;
import com.sgs.vision.common.exceptions.NotValidTokenException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class TokenManager {
	
	private static final Logger logger = LogManager.getLogger(TokenManager.class.getName());

	@Value("${ks.fileName}") private String fileName;
	@Value("${ks.keyAlias}") private String keyAlias;
	@Value("${ks.type}") private String ksType;
	@Value("${ks.password}") private String password;
	@Value("${token.accessToken.ttl}") private int accessTokenTtl;
	@Value("${token.refreshToken.ttl}") private int refreshTokenTtl;
	@Value("${token.ecryption.alg}") private String alg;
	@Autowired private TokenRepository tokenRepository;
	
	private static final String TOKEN_TYPE_HEADER_INTERNAL = "tpe";
	private static final String TOKEN_TYPE_HEADER_EXTERNAL = "typ";
	private static final String TOKEN_TYPE_EXTERNAL_VALUE = "JWT";
	private static final String ISSUER = "SGSGatewayApi";
	

	
	public String generate(String userId, TokenType tokenType) throws Exception{
		
		logger.info(">> generate : userId="+userId+", tokenType="+tokenType.name());
		
		if (userId == null || tokenType == null)
			throw new NullPointerException();
		
		Key key = getKeyFromKeyStore();
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		
		DateTime expDate = new DateTime();
		if (tokenType == TokenType.ACCESS)
			expDate = expDate.plusMinutes(accessTokenTtl);
		else
			expDate = expDate.plusMinutes(refreshTokenTtl);
		
		String token = Jwts.builder()
						.setId(UUID.randomUUID().toString())
						.setIssuer(ISSUER)
						.setSubject(userId.toString())
						.setIssuedAt(new Date())
						.setExpiration(expDate.toDate())
						.setHeaderParam(TOKEN_TYPE_HEADER_EXTERNAL, TOKEN_TYPE_EXTERNAL_VALUE)
						.setHeaderParam(TOKEN_TYPE_HEADER_INTERNAL, tokenType.toString().toLowerCase())
						.signWith(signatureAlgorithm, key)
						.compact();
		token = encrypt(key, token);
		
		//save token
		if (tokenType == TokenType.ACCESS)
			tokenRepository.save(token, accessTokenTtl);
		else
			tokenRepository.save(token, refreshTokenTtl);
		logger.info("<< generate : userId="+userId+", tokenType="+tokenType.name());
		return token;
	}
	
	public String parse(String token, TokenType tokenType) throws KeyStoreException, ExpiredTokenException, NotValidTokenException{
		logger.info(">> parse : token="+token+", tokenType="+tokenType.name());
		String userId = null;
		Key key = getKeyFromKeyStore();
		try{
			String decryptedToken = decrypt(key, token);
			Jws<Claims> jws = Jwts.parser()
								.setSigningKey(key)
								.parseClaimsJws(decryptedToken);
			Claims claims = jws.getBody();
			String subject = claims.getSubject();
			
			String value = jws.getHeader().get(TOKEN_TYPE_HEADER_INTERNAL).toString().toUpperCase();
			TokenType detectedtTpe = TokenType.valueOf(value);
			if (detectedtTpe != tokenType)
				throw new Exception("Incorrect token type");
			
			if (!tokenRepository.exist(token))
				throw new NotValidTokenException();
			
			userId = subject;
			logger.info("<< parse : token="+token+", tokenType="+tokenType.name()+", userId<--"+userId);
			return userId;
		}catch(ExpiredJwtException expExc){
			logger.error(expExc);
			throw new ExpiredTokenException();
		}catch(Exception ex){
			logger.error(ex);
			throw new NotValidTokenException();
		}

	}
	
	private Key getKeyFromKeyStore() throws KeyStoreException {
		try{
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream(fileName);
	
		    KeyStore keystore = KeyStore.getInstance(ksType);
		    char[] passwordCharArray = password.toCharArray();
		    keystore.load(is, passwordCharArray);
		    Key key = keystore.getKey("token_signer", passwordCharArray);
		    is.close();
		    return key;
		}catch(Exception ex){
			//logger.error("Exception: {}, Message: {}", ex.getMessage());
			throw new KeyStoreException("Could not get secret key");
		}
	   
	}
	
	private String encrypt(Key key, String token) throws Exception{
		Cipher cipher = Cipher.getInstance(alg);
		cipher.init(Cipher.ENCRYPT_MODE, key);
 		byte[] encrypted = cipher.doFinal(token.getBytes());
 		token = Base64.getEncoder().encodeToString(encrypted);
		return token;
	}
	
	private String decrypt(Key key, String token) throws Exception{
		Cipher cipher = Cipher.getInstance(alg);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] encrypted = Base64.getDecoder().decode(token);
 		byte[] decrypted = cipher.doFinal(encrypted);
 		token = new String(decrypted);
		return token;
	}
}
