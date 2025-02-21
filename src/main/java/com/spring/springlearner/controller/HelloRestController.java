package com.spring.springlearner.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @RequestMapping("/home")
    public String hello(){
        return "Welcome to BridgeLabz";
    }

}
