package com.example.test_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RestControl {
    @Autowired
    @RequestMapping(value = "/ws/post", method = RequestMethod.POST)
    public String getParmWithAjax() {
    return "Welcome to Hellow World !! ";
    }
}
