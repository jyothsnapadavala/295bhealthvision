create table PATIENTS (
	pid		bigint unsigned not null,
	fname		varchar(2048) not null,
	lname		varchar(2048) not null,
	addressline1	varchar(2048) not null,
	addressline2	varchar(2048) not null,
	city		varchar(128) not null,
	state		varchar(128) not null,
	zip		bigint unsigned not null,
	status		enum('Active', 'Inactive', 'Other'),
		primary key (pid)
)	engine=innodb; 