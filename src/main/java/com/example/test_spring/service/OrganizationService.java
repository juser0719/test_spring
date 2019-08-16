package com.example.test_spring.service;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService 
{
    public Object actionMethod() {
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301202");
        resultObject.put("MEMBER_HW", "010-5495-3366");
        resultObject.put("MEMBER_NUM", "32154080");
        return resultObject;
    }

	
}