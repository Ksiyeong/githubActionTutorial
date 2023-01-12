package com.eroom.linodegithubactiontest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${my.name}")
    private String name;

    @GetMapping
    public String hello() {


        return name;
    }

}
