package com.azber.springboot.kafka;

import com.azber.springboot.kafka.producer.KafkaProducerConfig;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(KafkaProperties.class)
public class KafkaAutoConfiguration {

    @Bean
    public KafkaProducerConfig kafkaProducerConfig() {
        return new KafkaProducerConfig();
    }
}
