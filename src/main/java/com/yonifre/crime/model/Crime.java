package com.yonifre.crime.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Crime {

	@Id
	@GeneratedValue
	private Long _id;
	
	private Category category;
	private Long numberOfPeopleInvolved;
	private Origin origin;
	private String message;
	private Age age;
	private Date date;
	private Location location;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getNumberOfPeopleInvolved() {
		return numberOfPeopleInvolved;
	}

	public void setNumberOfPeopleInvolved(Long numberOfPeopleInvolved) {
		this.numberOfPeopleInvolved = numberOfPeopleInvolved;
	}

	public Origin getOrigin() {
		return origin;
	}

	public void setOrigin(Origin origin) {
		this.origin = origin;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
