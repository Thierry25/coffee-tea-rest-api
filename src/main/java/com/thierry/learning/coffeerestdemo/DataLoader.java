package com.thierry.learning.coffeerestdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataLoader {
    private final TeaRepository teaRepository;

    public DataLoader(TeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }

    @PostConstruct
    public void loadData(){
        this.teaRepository.saveAll(List.of(
           new Tea("Green Tea"),
           new Tea("Red Tea"),
           new Tea("Yellow Tea"),
           new Tea("Purple Tea"),
           new Tea("Red Tea")
        ));
    }
}
