package com.example.demo.service;

import com.example.demo.Model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Supplier;

@EnableBinding(Source.class)
public class DemoService {
    @Bean
    public Supplier<Message<Demo>> demoSupplier() {
        return () -> MessageBuilder.withPayload(new Demo("makehoney"))
                .setHeader(MessageHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .build();
    }
}
