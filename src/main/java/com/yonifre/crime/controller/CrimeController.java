package com.yonifre.crime.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonifre.crime.model.Crime;
import com.yonifre.crime.model.input.CrimeInput;

@RestController
public class CrimeController {

	@RequestMapping(path="/crimes",  method = RequestMethod.POST)
	public Crime registerCrime(@RequestBody CrimeInput crimeInput) {
		
		
		return new Crime();
	}
	
	@RequestMapping(path="/crimes",  method = RequestMethod.GET)
	public  List<Crime> getAllCrimes() {
		ArrayList<Crime> crimes = new ArrayList<Crime>();
		
		return crimes;
	}
	
	@RequestMapping(path="/crimes/{category}",  method = RequestMethod.GET)
	public  List<Crime> getAllCrimesForCategory(@PathVariable String category) {
		ArrayList<Crime> crimes = new ArrayList<Crime>();
		
		return crimes;
	}
	
	@RequestMapping(path="/crimes",  method = RequestMethod.GET)
	public  List<Crime> getAllCrimesForCategory(@RequestParam(value="long", defaultValue="-1") Float longitude, @RequestParam(value="long", defaultValue="-1") Float latitude ) {
		ArrayList<Crime> crimes = new ArrayList<Crime>();
		
		return crimes;
	}


}
