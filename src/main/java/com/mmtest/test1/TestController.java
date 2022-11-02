package com.mmtest.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TestController {

	@GetMapping("/helloworld")
	public String getHelloWorld() {
		String result = "Hello World";
		return result;
	}
	
	@GetMapping("/hellohere")
	public String getHelloHere() {
		String result = "Hello Here";
		return result;
	}
	
	@GetMapping("/hellothere")
	public String getHelloThere() {
		String result = "Hello There";
		return result;
	}
}
