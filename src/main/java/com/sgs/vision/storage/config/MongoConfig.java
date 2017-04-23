package com.sgs.vision.storage.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Configuration
@EnableMongoRepositories(basePackages = "com.sgs.vision.storage.repository")
@PropertySource("classpath:/mongo.properties")
public class MongoConfig extends AbstractMongoConfiguration {

	private final static String mongodbDefaultPort = "27017";

	@Value("${mongodb.host}")
	private String hostName;

	@Value("${mongodb.port}")
	private String port;

	@Value("${mongodb.user.name}")
	private String user;

	@Value("${mongodb.user.password}")
	private String password;
	
	@Value("${mongodb.name}")
	private String dataBaseName;


	@Override
	public Mongo mongo() throws Exception {
		int portNumber = Integer.valueOf(port == null ? mongodbDefaultPort : port);
		MongoCredential credential = MongoCredential.createScramSha1Credential(user,dataBaseName,password.toCharArray());
		List<MongoCredential> credentials = new ArrayList<>();
		credentials.add(credential);
		//TODO enable security
		ServerAddress serverAddress = new ServerAddress(hostName,portNumber);
		
		//return new MongoClient(hostName,portNumber);
		// return new MongoClient(serverAddress,credentials);
		return new MongoClient(serverAddress);
	}

	@Override
	public String getMappingBasePackage() {
		return "com.sgs.vision.storage";
	}

	@Bean
	public GridFsTemplate gridFsTemplate() throws Exception {
		return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
	}


	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(mongo(), getDatabaseName());
	}

	@Override
	protected String getDatabaseName() {
		return this.dataBaseName;
	}

	/**
	 * @Bean public MongoDbFactory mongoDbFactory() throws Exception { int
	 *       portNumber = Integer.valueOf(port == null ? mongodbDefaultPort :
	 *       port); return new SimpleMongoDbFactory(new MongoClient(hostName,
	 *       portNumber), "database"); }
	 **/
}
