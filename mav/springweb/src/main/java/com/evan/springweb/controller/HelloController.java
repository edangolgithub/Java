package com.evan.springweb.controller;


import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public HashMap<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("greeting", "Hello");
        map.put("planet", "World");

        return map;
    }
    
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}