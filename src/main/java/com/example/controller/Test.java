package com.example.controller;

import com.example.orderservice.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Test {
    @Autowired
    OrderService orderService;
    @GetMapping("order/{id}")
    public String order(@PathVariable String id){
        orderService.order(id);
        return "成功";
    }
    @GetMapping("/do")
    public void doo(){

    }
}
