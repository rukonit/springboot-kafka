package com.rukon.springbootkafka.service;

import com.rukon.springbootkafka.model.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService {

    private Message message;

    public MessageServiceImpl() {
        this.message = new Message();
    }



    public String setMessageInfo(String sender, String receiver, String message) {
        this.message.setSender(sender);
        this.message.setReceiver(receiver);
        this.message.setMessage(message);

        return sender;
    }

    @Override
    public String getMessage() {
        return this.message.toString();
    }
}
