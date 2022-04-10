package com.thierry.learning.coffeerestdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class CoffeeDataLoader {
    private final CoffeeRepository coffeeRepository;

    public CoffeeDataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    void addData(){
        this.coffeeRepository.saveAll(List.of(
           new Coffee("Cafe Rebo"),
           new Coffee("Cafe Toro"),
           new Coffee("Cafe Noir"),
           new Coffee("Cafe au Lait"),
           new Coffee("Cappuccino")
        ));
    }
}
