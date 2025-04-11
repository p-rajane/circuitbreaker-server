package com.circuitbreaker.server.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Controller {
	
	@GetMapping("/getNameList")
	public Mono<String> getNameList() {
		return Mono.just("Welcome to get client resposne.");
	}
}
