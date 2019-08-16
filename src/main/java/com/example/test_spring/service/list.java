package com.example.test_spring.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class list
{ 
    public Object actionMethod() {
        ArrayList<Object> resultObject = new ArrayList<Object>();
        Map<String, Object> data1 = new HashMap<String, Object>();
        Map<String, Object> data2 = new HashMap<String, Object>();
        Map<String, Object> data3 = new HashMap<String, Object>();
        data1.put("MEMBER_ID", "293029301202");
        data1.put("MEMBER_PW", "123123113312");
        data1.put("MEMBER_DAY", "2019-08-16");
        data2.put("MEMBER_NAME", "WOONG JAE JEON");
        data2.put("MEMBER_BIRTH", "1996-12-12");
        data2.put("MEMBER_MALE", "SUPER MALE");
        data3.put("MEMBER_1", "010-5495-3366");
        data3.put("MEMBER_2", "sinsa0077@naver.com");
        data3.put("MEMBER_3", "DAEGU");
        resultObject.add(data1);
        resultObject.add(data2);
        resultObject.add(data3);
        
        return resultObject;
    }

	
}