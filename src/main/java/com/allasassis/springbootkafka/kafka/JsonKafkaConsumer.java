package com.allasassis.springbootkafka.kafka;

import com.allasassis.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @KafkaListener(topics = "firstKafka_json", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Message received -> %s", user));
    }
}
