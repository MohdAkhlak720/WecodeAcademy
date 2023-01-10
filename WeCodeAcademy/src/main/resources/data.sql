CREATE TABLE persons  (  
	personID int,  
	Name varchar(255),   
	Email varchar(255),   
	City varchar(255),
	PRIMARY KEY (personID)  
);  

INSERT INTO persons
VALUES(1,'Akhlak','akhlak@gmail','Jaipur'),
	  (2,'Asfak','asfak@gmail','Jaipur '),
	  (3,'Sohil','sohil@gmail','Jaipur '),
	  (4,'Sajid','sajid@gmail','Jaipur '),
	  (5,'Juber','juber@gmail','Jaipur ');

select name from persons;
