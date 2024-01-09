package com.helloworld.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class helloworld {
    @RequestMapping("api/hello-world")
    @GetMapping
    public List<String> getHelloWorld(){
        return List.of("Hello","World");
    }
}
