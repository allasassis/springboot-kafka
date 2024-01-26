package com.allasassis.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic firstKafkaTopic() {
        return TopicBuilder.name("firstKafka").build();
    }

    @Bean
    public NewTopic firstJsonKafkaTopic() {
        return TopicBuilder.name("firstKafka_json").build();
    }
}
