package com.fajarstevanus.startjava.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public com.fajarstevanus.startjava.demo.model.dto.Greeting greeting(String name) {
        return new com.fajarstevanus.startjava.demo.model.dto.Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
