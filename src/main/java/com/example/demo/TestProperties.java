package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestProperties {
    @Value("${com.example.name}")
    private String name;
    @Value("${com.example.learning}")
    private String learning;

    public String getName() {
        return name;
    }

    public String getLearning() {
        return learning;
    }
}


