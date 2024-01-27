package com.allasassis.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.retry.topic.name}")
    private String topicName;

    @Value("${spring.kafka.retry.topic-json.name}")
    private String jsonTopicName;

    @Bean
    public NewTopic firstKafkaTopic() {
        return TopicBuilder.name(topicName).build();
    }

    @Bean
    public NewTopic firstJsonKafkaTopic() {
        return TopicBuilder.name(jsonTopicName).build();
    }
}
