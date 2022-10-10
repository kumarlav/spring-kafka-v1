package com.lk.controller;

import com.lk.kafka.KafkaJsonProducer;
import com.lk.kafka.KafkaProducer;
import com.lk.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka/v1")
public class JsonKafkaController {

    private final KafkaJsonProducer kafkaProducer;

    public JsonKafkaController(KafkaJsonProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/sendMessage")
    public ResponseEntity<String> publishMessage(@RequestBody User data){
        kafkaProducer.sendMessage(data);
        return ResponseEntity.ok("Message Sent to Topic");
    }

}
