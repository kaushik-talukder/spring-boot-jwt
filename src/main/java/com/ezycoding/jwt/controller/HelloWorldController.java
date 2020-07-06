package com.ezycoding.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class HelloWorldController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<Object> hello() {
		return ResponseEntity.ok("Hello world !!");
	}
}
