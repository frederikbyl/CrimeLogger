package com.yonifre.crime.model;

public class Crime {
	
	private Category category;
	private Long numberOfPeopleInvolved;
	private Origin origin;
	private String message;
	private Age age;
	
	
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
	
	

}
