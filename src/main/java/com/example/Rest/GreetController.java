package com.example.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetController {
	
	@GetMapping("/")
	public String getGreetMsg() {
		return " welcome to docker file";
	}
	

}
