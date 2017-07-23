package com.yonifre.crime.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yonifre.crime.model.Age;
import com.yonifre.crime.model.Category;
import com.yonifre.crime.model.Crime;
import com.yonifre.crime.model.Location;
import com.yonifre.crime.model.convertor.CrimeConvertor;
import com.yonifre.crime.model.dao.CrimeDao;
import com.yonifre.crime.repository.CrimeRepository;

@RestController
public class CrimeController {

	@Autowired
	private CrimeRepository crimeRepository;

	@RequestMapping(value = "/authenticate", method = RequestMethod.GET)
	public ModelAndView method(HttpServletResponse httpServletResponse) {
		 return new ModelAndView("redirect:" + "http://localhost:8080/app/index.html#");
	}

	@RequestMapping(path = "/crimes", method = RequestMethod.POST)
	public Crime registerCrime() {
//		UserInfo userInfo = (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		System.out.println("Name" + userInfo.getFamilyName());
		Crime crime = new Crime();
		crime.setAge(Age.ADOLESCENT);
		crime.setCategory(Category.DRUGS);
		crime.setDate(new Date());
		Location location = new Location();

		location.setLatitude(51.0035671);
		location.setLongitude(4.838756);

		crime.setLocation(location);

		CrimeDao crimeDao = CrimeConvertor.convert(crime);

		CrimeDao savedCrime = crimeRepository.save(crimeDao);

		return crime;
	}

	@RequestMapping(path = "/crimes", method = RequestMethod.GET)
	public List<Crime> getAllCrimes(@RequestParam(value = "longitude", defaultValue = "-1") double longitude,
			@RequestParam(value = "latitude", defaultValue = "-1") double latitude,
			@RequestParam(value = "radius", defaultValue = "-1") double radius) {
//		UserInfo userInfo = (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		System.out.println("Name" + userInfo.getId() + " " + userInfo.getGivenName());

		ArrayList<Crime> crimes = new ArrayList<Crime>();
		double latitude1 = 51.0035671;
		double longitude1 = 4.838756;

		for (int i = 0; i < 50; i++) {
			Crime crime1 = new Crime();
			crime1.setAge(Age.ADOLESCENT);
			crime1.setCategory(Category.DRUGS);
			Location location = new Location();
			location.setLatitude(latitude1);
			location.setLongitude(longitude1);
			crime1.setLocation(location);
			crimes.add(crime1);
			latitude1 = latitude1 - 0.001;
			longitude1 = longitude1 - 0.001;
		}

		return crimes;
	}

	@RequestMapping(path = "/crimes/{category}", method = RequestMethod.GET)
	public List<Crime> getAllCrimesForCategory(@PathVariable String category,
			@RequestParam(value = "longitude", defaultValue = "-1") double longitude,
			@RequestParam(value = "latitude", defaultValue = "-1") double latitude) {
		ArrayList<Crime> crimes = new ArrayList<Crime>();

		return crimes;
	}

}
