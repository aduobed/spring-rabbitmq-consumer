package com.rabbitmq.springrabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {


    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(ExchangeData exchangeData) {
        System.out.println(exchangeData);
    }
}
