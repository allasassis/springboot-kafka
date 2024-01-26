package com.allasassis.springbootkafka.controller;

import com.allasassis.springbootkafka.kafka.JsonKafkaProducer;
import com.allasassis.springbootkafka.kafka.KafkaProducer;
import com.allasassis.springbootkafka.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @GetMapping("/publishjson")
    public ResponseEntity<String> publish(@RequestBody User user) {
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JSON Message sent to Kafka topic!");
    }
}
