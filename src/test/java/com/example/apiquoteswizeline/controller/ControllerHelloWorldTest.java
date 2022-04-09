package com.example.apiquoteswizeline.controller;


import com.example.apiquoteswizeline.service.GreetingService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ControllerHelloWorldTest {

    @Mock
    GreetingService greetingService;

    @InjectMocks
    ControllerHelloWorld controller;


    @Test
    public void itShouldReturnTheServiceValueWith200StatusCode() {
        when(greetingService.getGreeting()).thenReturn("Hello, World.");
        ResponseEntity<?> httpResponse = controller.getHelloWorld();

        Assert.assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
        Assert.assertEquals("Hello, World.", httpResponse.getBody());
    }
}
