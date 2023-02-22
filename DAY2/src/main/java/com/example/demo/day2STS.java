package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class day2STS {
	  @Value("${greeting.message}")
	    private String message;
	  
	  @RequestMapping("/Hello")
		public String getName(){
	        return message;
		}

}
