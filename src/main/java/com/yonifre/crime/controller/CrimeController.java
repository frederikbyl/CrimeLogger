package com.yonifre.crime.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yonifre.crime.model.Crime;
import com.yonifre.crime.model.input.CrimeInput;

@RestController
public class CrimeController {

	@RequestMapping(path="/crimes",  method = RequestMethod.POST)
	public Crime registerCrime(@RequestBody CrimeInput crimeInput) {
		
		
		return new Crime();
	}

}
