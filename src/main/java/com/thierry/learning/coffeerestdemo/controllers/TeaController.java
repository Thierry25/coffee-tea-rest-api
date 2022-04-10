package com.thierry.learning.coffeerestdemo.controllers;

import com.thierry.learning.coffeerestdemo.Tea;
import com.thierry.learning.coffeerestdemo.TeaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/teas")
public class TeaController {
    private final TeaRepository teaRepository;

    public TeaController(TeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }

    @GetMapping
    Iterable<Tea> getTeas(){
        return teaRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Tea> getTeaById(@PathVariable String id){
        return teaRepository.findById(id);
    }

    @PostMapping
    Tea postTea(@RequestBody Tea tea){
        return teaRepository.save(tea);
    }

    @PutMapping("/{id}")
    ResponseEntity<Tea> putTea(@PathVariable String id, @RequestBody Tea tea){
        return (teaRepository.existsById(id)) ?
                new ResponseEntity<>(teaRepository.save(tea), HttpStatus.OK) :
                new ResponseEntity<>(teaRepository.save(tea), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    void deleteTea(@PathVariable String id){
        teaRepository.deleteById(id);
    }
}
