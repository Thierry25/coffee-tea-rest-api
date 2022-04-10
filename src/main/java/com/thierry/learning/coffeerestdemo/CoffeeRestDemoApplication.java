package com.thierry.learning.coffeerestdemo;

import com.thierry.learning.coffeerestdemo.pojo.Droid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CoffeeRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeRestDemoApplication.class, args);
	}

	@Bean
	@ConfigurationProperties(prefix = "droid")
	Droid createDroid(){
		return new Droid();
	}

}
