CREATE TABLE student (
	seq INT NOT NULL AUTO_INCREMENT,
	id VARCHAR(30) NOT NULL,
	name VARCHAR(30) NOT NULL,
	age INT NOT NULL,
	primary key(seq)
);

INSERT INTO student(id, name, age)
VALUES ('juhwan', '허주환', 23);