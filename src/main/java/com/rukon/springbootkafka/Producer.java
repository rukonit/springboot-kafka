package com.rukon.springbootkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public static final String TOPIC = "heyBuddy";



    public void sendMessage(String message) {

        this.kafkaTemplate.send(TOPIC, message);
    }
}
