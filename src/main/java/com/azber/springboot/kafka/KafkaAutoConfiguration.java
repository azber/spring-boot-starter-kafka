package com.azber.springboot.kafka;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(KafkaProperties.class)
@ComponentScan("com.azber.springboot.kafka")
public class KafkaAutoConfiguration {

//    @Bean
//    public KafkaProducerConfig kafkaProducerConfig() {
//        return new KafkaProducerConfig();
//    }
//
//    @Bean
//    public KafkaConsumerConfig kafkaConsumerConfig() {
//        return new KafkaConsumerConfig();
//    }
}
