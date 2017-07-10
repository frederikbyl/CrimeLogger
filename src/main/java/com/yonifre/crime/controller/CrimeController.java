package com.yonifre.crime.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonifre.crime.model.Age;
import com.yonifre.crime.model.Category;
import com.yonifre.crime.model.Crime;
import com.yonifre.crime.model.Location;
import com.yonifre.crime.model.input.CrimeInput;

@RestController
public class CrimeController {

	@RequestMapping(path="/crimes",  method = RequestMethod.POST)
	public Crime registerCrime(@RequestBody CrimeInput crimeInput) {
		
		
		return new Crime();
	}
	
	@RequestMapping(path="/crimes",  method = RequestMethod.GET)
	public  List<Crime> getAllCrimes(@RequestParam(value="longitude", defaultValue="-1") double longitude, @RequestParam(value="latitude", defaultValue="-1") double latitude , @RequestParam(value="radius", defaultValue="-1") double radius ) {
		ArrayList<Crime> crimes = new ArrayList<Crime>();
		
		Crime crime1 = new Crime();
		crime1.setAge(Age.ADOLESCENT);
		crime1.setCategory(Category.DRUGS);
		Location location = new Location();
		crime1.setLocation(location);
		
		
		crimes.add(crime1);
		return crimes;
	}
	
	@RequestMapping(path="/crimes/{category}",  method = RequestMethod.GET)
	public  List<Crime> getAllCrimesForCategory(@PathVariable String category, @RequestParam(value="longitude", defaultValue="-1") double longitude, @RequestParam(value="latitude", defaultValue="-1") double latitude ) {
		ArrayList<Crime> crimes = new ArrayList<Crime>();
		
		return crimes;
	}
	

}
