package com.mbi.producer.subscriber;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = {"gadgets"}, groupId=" abc" )
	public void consumeMessage(String message)
	{
		System.out.println(message);
	}
	

}
