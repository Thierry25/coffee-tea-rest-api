package com.thierry.learning.coffeerestdemo;

import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}