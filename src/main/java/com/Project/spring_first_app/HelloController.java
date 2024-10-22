package com.Project.spring_first_app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HelloController {

    @GetMapping ( "/hello")
    public String hello(){
        return "HelloWorld";
    }
}
