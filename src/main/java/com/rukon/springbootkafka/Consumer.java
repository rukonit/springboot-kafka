package com.rukon.springbootkafka;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "heyBuddy", groupId = "group_id")
    public void cosumeMessage(String message) {
        JSONObject newMessage = new JSONObject(message);


        JSONArray array = new JSONArray();
        array.put(message);
        System.out.println("Message from: ["+ newMessage.get("sender") + "]: " + newMessage.get("message"));
    }
}
