package com.sgs.vision.api.notifications;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("messageSender")
public final class MessageSender {

	private static final Logger logger = LogManager.getLogger(MessageSender.class.getSimpleName());
	
	@Value("${mqtt.producerId}") private String producerId;
	@Value("${mqtt.brokerUrl}") private String brokerUrl;
	@Value("${mqtt.qos}") private Integer qos;
	@Value("${mqtt.topic.zone}") private String topic;
	@Value("${mqtt.connectionTimeOut}") private Integer connectionTimeOut;
    private MqttClient client;
    
    @PostConstruct
    public void init() throws IOException, MqttSecurityException, MqttException{
    	client = new MqttClient(brokerUrl, producerId);
    }
	
	private void connect() throws MqttSecurityException, MqttException{
		MqttConnectOptions connOpts = new MqttConnectOptions();
		connOpts.setCleanSession(true);
		connOpts.setConnectionTimeout(connectionTimeOut);
	   
		logger.debug("Connecting to broker: {}", brokerUrl);
		client.connect(connOpts);
		logger.debug("Connected to broker");
	}
	
	public final synchronized void sendMessage(String messageString) throws MqttPersistenceException, MqttException{
		sendMessage(topic, messageString);
	}
	
	public final synchronized void sendMessage(String topic, String messageString) throws MqttPersistenceException, MqttException{
		
		if (messageString == null)
			throw new NullPointerException("message is null");
		
		connect();
		
		MqttMessage message = new MqttMessage(messageString.getBytes());
		message.setQos(qos);
//		message.setRetained(true);
		
		client.publish(topic, message);
		logger.info("Message published to topic: {}", topic);
		
		client.disconnect();
		logger.debug("Disconnected");
        
	}
	
}
