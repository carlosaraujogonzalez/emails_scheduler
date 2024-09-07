package com.gbtec.scheduler.service.impl;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@Service
public class RabbitMQSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${email.rabbitmq.exchange}")
    private String exchange;

    @Value("${email.rabbitmq.routingkey}")
    private String routingkey;

    public void send(String message) {

        String CustomMessage = message;

        rabbitTemplate.convertAndSend(exchange, routingkey, CustomMessage);
        System.out.println("Send msg to consumer= " + CustomMessage+" ");
    }
}