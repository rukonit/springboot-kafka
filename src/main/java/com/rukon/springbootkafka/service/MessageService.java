package com.rukon.springbootkafka.service;

public interface MessageService {
    public String getMessage();
    public String setMessageInfo(String sender, String receiver, String message);
}
