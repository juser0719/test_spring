package com.example.test_spring.controller;

import com.example.test_spring.service.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class RestOpenWeather {
    @Autowired
    list OrganizationService;
    @RequestMapping(value = "/remote/openweather")

        public Object actionMethod() {
            RestTemplate restTemplate = new RestTemplate();
            Object tempObject = new Object();
            String keyId = "a2efb471990ef1e48ea7ff2b96f9f3c3";
            String targetUri = "https://samples.openweathermap.org/data/2.5/weather?q=SEOUL,uk&appid=a2efb471990ef1e48ea7ff2b96f9f3c3";
            Object resultObject = restTemplate.getForObject(targetUri, Object.class);
            
            return resultObject;
             
    }
}
