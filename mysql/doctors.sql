create table DOCTORS (
	did		bigint unsigned not null,
	fname		varchar(2048) not null,
	lname		varchar(2048) not null,
	specialization	varchar(2048) not null,
	education	varchar(2048) not null,
	certification	varchar(2048) not null,
	summary		varchar(2048) not null,
	addressline1	varchar(2048) not null,
	addressline2	varchar(2048) not null,
	city		varchar(128) not null,
	state		varchar(128) not null,
	zip		varchar(128) not null,
	status		enum('Active', 'Inactive', 'Other'),
		primary key (did)
)	engine=innodb; 