package com.yonifre.crime.model.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
public class CrimeDao {

//	@Id
//	@GeneratedValue
	private Long id;
	private String category;
	private Long numberOfPeopleInvolved;
	private String origin;
	private String message;
	private String age;
	private Date date;
	private Double longitude;
	private Double latitude;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Long getNumberOfPeopleInvolved() {
		return numberOfPeopleInvolved;
	}
	public void setNumberOfPeopleInvolved(Long numberOfPeopleInvolved) {
		this.numberOfPeopleInvolved = numberOfPeopleInvolved;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


}
