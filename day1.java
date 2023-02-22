package com.example.demo;


import org.springframework.web.bind.annotation.*;

@RestController
public class day1 {
	@GetMapping("/Display1")
	public String    welcome() {
		return "Welcome String Boot!";
	}
	
	@GetMapping("/Display2")
	public String getName(){
        String studentName ="IamNeo";
        return "Welcome "+studentName+"!";
	}
	
	@GetMapping("/Display3")
	public String getMyFav(){
        String yourFavColor ="Green";
        return "My favorite color is" + yourFavColor;
	}

}