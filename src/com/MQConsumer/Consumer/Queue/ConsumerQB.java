package com.MQConsumer.Consumer.Queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component
public class ConsumerQB implements MessageListener{

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("订阅人QA收到消息："+((TextMessage)message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
