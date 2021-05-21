package com.rukon.springbootkafka;

import com.rukon.springbootkafka.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


    private final Producer producer;
    private final MessageService message;



    @Autowired
    public MessageController(Producer producer, MessageService message) {
        this.producer = producer;
        this.message = message;
    }

    @PostMapping("/publish")
    public void messageToTopic(@RequestParam("message") String message) {
        this.message.setMessageInfo("Rukon", "Ripon", message);
        this.producer.sendMessage(this.message.getMessage());
    }


}
