DROP DATABASE robots;

CREATE DATABASE robots;

 \CONNECT robots
DROP TABLE jaegers;

CREATE TABLE jaegers (
	PRIMARY KEY (id),
	id			SERIAL,
	model_name	TEXT,
	mark		TEXT,
	height		REAL,
	weight		REAL,
	status		TEXT,
	origin		TEXT,
	launch_date	DATE,
	kaiju_kill	INT);