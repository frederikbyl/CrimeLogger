create database crime;

use crime;

create table crime(
	id bigint primary key AUTO_INCREMENT, 
	name varchar(128) charset utf8,
	
		private Category category;
	private Long numberOfPeopleInvolved;
	private Origin origin;
	private String message;
	private Age age;
	private Date date;
	private Location location;
	
	);




DROP TABLE IF EXISTS `credit_request`;
CREATE TABLE IF NOT EXISTS `credit_request` (
  `id` int(11) NOT NULL,
  `random_id` char(36) NOT NULL,
  `credit_amount` decimal(15,4) NOT NULL,
  `duration_in_months` int(11),
  `goal_id` int(11) NOT NULL,
  `financial_institution_id` int(11) NOT NULL,
  `is_approved` tinyint(1) DEFAULT null,
  `message` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
