create database Exercise1;
use Exercise1;
create table countries(COUNTRY_ID varchar(2), COUNTRY_NAME varchar(40), REGION_ID decimal(10,0));
insert into countries values('c1',"India",1001);	#1
desc countries;
select * from countries;

insert into countries(COUNTRY_ID,COUNTRY_NAME) values('c2',"Germany");	#2

create table country_new as select * from countries; #3
select * from country_new;

insert into countries(COUNTRY_ID,COUNTRY_NAME,REGION_ID) values('c3',"USA",Null);	#4

insert into countries values('c4',"UK",1002),('c4',"Japan",1003),('c4',"Canada",1040);	#5
insert into countries select * from country_new;	#6
select * from country_new; 

CREATE TABLE jobs (
JOB_ID integer NOT NULL AUTO_INCREMENT UNIQUE PRIMARY KEY,	#7 8
JOB_TITLE varchar(35) NOT NULL DEFAULT 'N/A',
MIN_SALARY decimal(6,0)
);
drop table jobs;
INSERT INTO jobs VALUES(1001,'OFFICER',8000);
INSERT INTO jobs (JOB_TITLE,MIN_SALARY) VALUES('sd',8000);
insert into jobs (min_salary) values(8900); 
INSERT INTO jobs (JOB_TITLE,MIN_SALARY) VALUES('officer',8009);
select * from jobs;

select COUNTRY_ID, COUNTRY_NAME from countries;
select DISTINCT country_id from countries;
select JOB_ID, min_salary from jobs where min_salary=8000;
select * from jobs where min_salary=8000;
select JOB_TITLE, min_salary from jobs where JOB_ID=1001;
select job_title,job_id from jobs where min_salary<=8009;
select job_title from jobs where min_salary<=8009 and job_id= 1004;
select * from jobs where min_salary between 8000 and 8009;
select avg(min_salary) from jobs where 1001 and 1004;
SELECT job_title as "Title", min_salary AS "Price in Rs." FROM jobs;
select job_title , min_salary, job_id from jobs where min_salary>=8000 order by min_salary desc, job_title;
select job_title , min_salary, job_id from jobs where min_salary = (select min(min_salary) from jobs);
select distinct job_title from jobs;



