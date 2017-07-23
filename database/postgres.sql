create database crime;

use crime;

create table crime(
	id bigint SERIAL primary key , 
	name varchar(128) charset utf8,
	
		private Category category;
	private Long numberOfPeopleInvolved;
	private Origin origin;
	private String message;
	private Age age;
	private Date date;
	private Location location;
	
	);