DROP TABLE IF EXISTS students;

CREATE TABLE students (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  class     VARCHAR(250) NOT NULL,
  address1  VARCHAR(250) NOT NULL,
  address2  VARCHAR(250) NULL,
  state     VARCHAR(50) NOT NULL,
  city      VARCHAR(50) NOT NULL,
  zip5      NUMBER NOT NULL,
  zip4      NUMBER NULL,
  country   VARCHAR(50) NOT NULL,
  age       NUMBER NOT NULL,
  sex       VARCHAR(1) NOT NULL
);

INSERT INTO students (id,first_name, last_name, class, address1, address2, state, city, zip5, zip4, country, age, sex ) VALUES
  (1,'Pablo', 'Escobar', 'FIRST','434 Dist Rd',null,'FL','Miami',32333,0,'USA',6,'M'),
  (2,'Bill', 'Gates', 'FIRST','434 Dist Rd',null,'FL','Miami',32333,0,'USA',6,'M'),
  (3,'Virat', 'Kolhi', 'SECOND','434 Dist Rd',null,'FL','Miami',32333,0,'USA',7,'M'),
  (4,'Indra', 'Gandhi', 'THIRD','434 Dist Rd',null,'FL','Miami',32333,0,'USA',8,'F');