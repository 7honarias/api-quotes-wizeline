package com.example.apiquoteswizeline.controller;

import com.example.apiquoteswizeline.service.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greet")
public class ControllerHelloWorld {

    private final GreetingService greetingService;

    public ControllerHelloWorld(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public ResponseEntity<?> getHelloWorld(){
        return new ResponseEntity<>(greetingService.getGreeting(), HttpStatus.OK);
    }
}
