package com.example.orderservice;

import com.example.message.MessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    MessageService messageService;
    @Override
    public void order(String id) {
        System.out.println("订单开始处理");
        messageService.sendMessage(id);
        System.out.println("订单处理结束");
    }
}
