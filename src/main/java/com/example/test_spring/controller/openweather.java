package com.example.test_spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class openweather {
    @RequestMapping(value = "/weather", method = RequestMethod.GET)
    public Object actionMethod()
    {
        RestTemplate restTemplate = new RestTemplate();
        Object resultObject = new Object();
        String keyid = "a2efb471990ef1e48ea7ff2b96f9f3c3";
        String targeturi = "https://samples.openweathermap.org/data/2.5/forecast?id=1835848&appid=" + keyid;
        resultObject = restTemplate.getForObject(targeturi, Object.class);
        return resultObject;
    }
}