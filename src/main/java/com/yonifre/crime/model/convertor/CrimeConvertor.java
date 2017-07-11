package com.yonifre.crime.model.convertor;

import com.yonifre.crime.model.Age;
import com.yonifre.crime.model.Category;
import com.yonifre.crime.model.Crime;
import com.yonifre.crime.model.Location;
import com.yonifre.crime.model.Origin;
import com.yonifre.crime.model.dao.CrimeDao;

public class CrimeConvertor {
	
	public static Crime convert(CrimeDao crimeDao){
		Crime crime = new Crime();
		
		crime.setAge(Age.valueOf(crimeDao.getAge()));
		crime.setCategory(Category.valueOf(crimeDao.getCategory()));
		crime.setDate(crimeDao.getDate());
		Location location = new Location();
		location.setLatitude(crimeDao.getLatitude());
		location.setLongitude(crimeDao.getLongitude());
		crime.setLocation(location);
		crime.setMessage(crimeDao.getMessage());
		crime.setNumberOfPeopleInvolved(crimeDao.getNumberOfPeopleInvolved());
		crime.setOrigin(Origin.valueOf(crimeDao.getOrigin()));
		
		return crime;
	}
	
	public static CrimeDao convert(Crime crime){
		CrimeDao crimeDao = new CrimeDao();
		
		if(crime.getAge()!= null)
			crimeDao.setAge(crime.getAge().name());
		crimeDao.setCategory(crime.getCategory().name());
		crimeDao.setDate(crime.getDate());
		crimeDao.setLatitude(crime.getLocation().getLatitude());
		crimeDao.setLongitude(crime.getLocation().getLongitude());
		crimeDao.setMessage(crime.getMessage());
		crimeDao.setNumberOfPeopleInvolved(crime.getNumberOfPeopleInvolved());
		if(crime.getOrigin()!= null)
			crimeDao.setOrigin(crime.getOrigin().name());
		
		
		
		return crimeDao;
	}

}
