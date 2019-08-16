package com.example.test_spring.controller;

import com.example.test_spring.service.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RestWSController {
    @Autowired
    list OrganizationService;
    @RequestMapping(value = "/ws/list", method = RequestMethod.POST)

        public Object actionMethod() {
            Object resultObject = new Object();
            resultObject = OrganizationService.actionMethod();
        return resultObject;
    }
}
