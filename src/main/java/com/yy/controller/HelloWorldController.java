package com.yy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String hello(){
        return "hello world";
    }
	
	@RequestMapping("/test")
	public Map<String,String> testMap(){
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", "彭云云");
		map.put("sex", "male");
		return map;
	}
}
