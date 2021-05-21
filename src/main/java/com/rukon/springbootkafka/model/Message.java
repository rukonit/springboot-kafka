package com.rukon.springbootkafka.model;

import org.json.JSONObject;

import java.io.StringWriter;

public class Message {
    private String sender;
    private String receiver;
    private String message;


    public Message(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;

    }

    public Message() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        JSONObject message = new JSONObject();
        StringWriter out = new StringWriter();

        message.put("sender", this.getSender());
        message.put("receiver", this.getReceiver());
        message.put("message", this.getMessage());



        return message.toString();



    }
}
