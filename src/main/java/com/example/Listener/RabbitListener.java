package com.example.Listener;

import org.springframework.stereotype.Component;

@Component
public class RabbitListener {
    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "squeue")
    public void cons(String id){
        System.out.println("短信业务已结束+++："+id);
    }
}
