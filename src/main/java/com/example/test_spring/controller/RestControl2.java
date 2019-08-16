package com.example.test_spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RestControl2 {
    @Autowired
    
    @RequestMapping(value = "/ws/ajax", method = RequestMethod.POST)
    public String getParmWithAjax(@RequestParam Map<String,Object> paramMap) {
        String str = (String) paramMap.get("title");
        return str;
    }
}
