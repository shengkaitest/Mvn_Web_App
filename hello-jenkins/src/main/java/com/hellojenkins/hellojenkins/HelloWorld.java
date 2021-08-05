package com.hellojenkins.hellojenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String HelloWorldJenkins() {
        return "Hello World Jenkins!!";
    }
}