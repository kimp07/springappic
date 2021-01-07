-- we don't know how to generate root <with-no-name> (class Root) :(
create table ROLES
(
	_id integer not null
		constraint ROLES_pk
			primary key autoincrement,
	role_name varchar(30)
);

create unique index ROLES__id_uindex
	on ROLES (_id);

create table USERS
(
	_id integer not null
		constraint USERS_pk
			primary key autoincrement,
	user_name varchar(30) not null,
	password varchar(512) not null,
	email varchar(100) not null,
	role_id integer not null,
	full_name varchar(100)
);

create unique index USERS__id_uindex
	on USERS (_id);

create unique index USERS_user_name_uindex
	on USERS (user_name);

insert into ROLES (role_name) values ('admin');
insert into ROLES (role_name) values ('user');
