package com.sgs.vision.api.notifications;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("notifier")
public class Notifier {
	
	private static Logger logger = LogManager.getLogger(Notifier.class.getName());
	
	@Value("${mqtt.topic.zone}") private String zoneTopic; 
	@Autowired private MessageSender messageSender;
	
	public void notifyUpdatedIssue(String zoneId){
		logger.debug(">> notifyUpdatedIssue : zoneId="+zoneId);
		String topic = zoneTopic + zoneId;
		sendNotification(topic, NotificationType.ISSUES_UPDATE.name());
		logger.debug("<< notifyUpdatedIssue : zoneId="+zoneId);
	}
	
	public void sendNotification(String topic, String message){
		logger.debug(">> sendNotification : topic="+topic+", message="+message);
		try {
			messageSender.sendMessage(topic, message);
		} catch (MqttException e) {
			e.printStackTrace();
			logger.error("<< sendNotification : topic="+topic+", message="+message, e);
		}
		logger.debug("<< sendNotification : topic="+topic+", message="+message);
	}
	
	public enum NotificationType{
		FITTING_ROOM_NEW_ITEM_ARRIVED,
		ISSUES_UPDATE,
	}
}
