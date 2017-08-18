package com.MQConsumer.Consumer.Topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component("consumerTA")
public class ConsumerTA implements MessageListener{

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("������TA�յ���Ϣ��"+((TextMessage)message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	} 
}
