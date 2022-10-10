package com.lk.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic newTopic(){
        return TopicBuilder
                .name("topic-example1")
                .build();
    }

    @Bean
    public NewTopic jsonTopic(){
        return TopicBuilder
                .name("topic-example-json")
                .build();
    }
}
