DROP DATABASE robots;
CREATE DATABASE robots;
\connect robots
DROP TABLE jaegers;
	CREATE TABLE jaegers (
		id SERIAL PRIMARY KEY,
		modelName TEXT,
		mark TEXT,
		height REAL,
		weight REAL,
		status TEXT,
		origin TEXT,
		launch DATE,
		kaijuKill INT);