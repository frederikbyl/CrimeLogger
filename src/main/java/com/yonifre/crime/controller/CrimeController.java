package com.yonifre.crime.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonifre.crime.model.Crime;

@RestController
public class CrimeController {

	@RequestMapping("/crimes")
	public Crime registerCrime(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
