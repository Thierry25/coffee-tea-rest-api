package com.thierry.learning.coffeerestdemo;

import org.springframework.data.repository.CrudRepository;

public interface TeaRepository extends CrudRepository<Tea, String> {}
