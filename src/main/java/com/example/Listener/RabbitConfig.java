package com.example.Listener;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue getQueue(){
        return new Queue("squeue",true,false,false);
    }

    @Bean
    public DirectExchange getexchange(){
        return new DirectExchange("directExchange");
    }
    @Bean
    public Binding getBind(){
        return BindingBuilder.bind(getQueue()).to(getexchange()).with("bind1");
    }
}
