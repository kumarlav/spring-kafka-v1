package com.lk.kafka;

import com.lk.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaJsonConsumer.class);

    @KafkaListener(topics = "topic-example-json", groupId = "myGroup")
    public void consumeMessage(User data){
        logger.info(String.format("Message received ::  %s ",data.toString()));
    }
}
