package com.example.message;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    AmqpTemplate amqpTemplate;
    @Override
    public void sendMessage(String id) {
        amqpTemplate.convertAndSend("directExchange","bind1",id);
        System.out.println("rabbit短信提示开始+++："+id);
    }

}
