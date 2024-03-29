package com.example.test_spring.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.client.RestTemplate;

public class RestOpenWeather {
    @RequestMapping(value = "/remote/weather", method = RequestMethod.POST)
    public Object actionMethod(){
        RestTemplate restTemplate = new RestTemplate();
        Object resultObject = new Object();
        String keyid = "a2efb471990ef1e48ea7ff2b96f9f3c3";
        String targeturi = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid="+keyid;
        resultObject = restTemplate.getForObject(targeturi, Object.class);
        return resultObject;
    }
}