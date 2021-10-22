package com.actbase.rest.demo.controller;

import com.actbase.rest.demo.service.GreetServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @Autowired
    GreetServiceImpl service;

    @GetMapping("hello")
    public String Greeting(String name) {
        String result = null;
        result = service.say(name);
        return result;
    }
}