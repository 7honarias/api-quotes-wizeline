package com.example.apiquoteswizeline.service.impl;

import com.example.apiquoteswizeline.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello, World.";
    }
}
