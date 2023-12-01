CREATE TABLE users (
	ID BIGINT auto_increment NOT NULL,
	NAME varchar(255) NOT NULL,
	LOGIN varchar(100) NOT NULL,
	PASSWORD varchar(100) NOT NULL,
	CONSTRAINT usuario_pk PRIMARY KEY (ID),
	CONSTRAINT usuario_un_login UNIQUE KEY (LOGIN)
);