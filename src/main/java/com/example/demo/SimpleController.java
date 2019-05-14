package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/simpleController")
public class SimpleController {

	@GetMapping
	public String add(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b) {
		return String.valueOf(a + b);
	}
	
	@GetMapping(path="/helloworld")
	public String helloworld() {
		return "Hello World";
	}
}
