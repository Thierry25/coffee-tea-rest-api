package com.thierry.learning.coffeerestdemo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "greeting")
//prefix: Will be used for all Greeting's properties
public class Greeting {
    private String name;
    private String tea;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTea() {
        return tea;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }
}
