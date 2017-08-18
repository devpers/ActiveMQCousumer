package com.MQConsumer.Consumer.Topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component("consumerTB")
public class CousumerTB implements MessageListener{

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("������TB�յ���Ϣ��"+((TextMessage)message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
