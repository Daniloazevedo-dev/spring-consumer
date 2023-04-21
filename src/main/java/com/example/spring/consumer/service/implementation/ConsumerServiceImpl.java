package com.example.spring.consumer.service.implementation;

import com.example.spring.consumer.dto.MessageQueue;
import com.example.spring.consumer.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(MessageQueue messageQueue) {
        if("teste".equalsIgnoreCase(messageQueue.getText())) {
            throw new AmqpRejectAndDontRequeueException("erro");
        }
        System.out.println(messageQueue.getText());
    }
}
