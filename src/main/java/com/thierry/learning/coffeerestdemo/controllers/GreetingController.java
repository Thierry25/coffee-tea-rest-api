package com.thierry.learning.coffeerestdemo.controllers;

import com.thierry.learning.coffeerestdemo.pojo.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")

public class GreetingController {
   private final Greeting greeting;

    public GreetingController(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping
    String getGreeting(){
        return greeting.getName();
    }

    @GetMapping("/tea")
    String getNameAndTea(){
        return greeting.getTea();
    }
}