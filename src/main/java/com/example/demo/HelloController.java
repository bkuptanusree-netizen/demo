package com.example.demo;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, from Get API!";
	}

	@PostMapping("/greet")
	public String greet(@RequestBody String name) {
		return "Hello, " + name + "from Post API!";
	}

	@PostMapping("/trigger")
	public Map<String, String> trigger(
		@RequestParam String name,
		@RequestParam String message) {
		Map<String, String> response = new HashMap<>();
		response.put("name", name);
		response.put("message", message);
		response.put("status", "triggered");
		return response;
	}
}
