create database Assignment;
use Assignment;
create table Employee(emp_id int primary key,f_name varchar(30),dep varchar(30));
insert into Employee values(1," apurwa ","comp");
insert into Employee values(2," Kalyani ","comp"),(3," dhani ","comp"),(4," shreya ","comp");
select * from Employee;

alter table employee add l_name varchar(30); 
alter table employee add salary int; 
alter table employee modify l_name varchar(50);
rename table employee to employee_Details;
select * from employee_Details;

update employee_Details set l_name = "bhoir" where emp_id =1; 
update employee_Details set l_name = "swamy", salary=30000 where emp_id =2; 

update employee_Details set l_name = "kapoor",dep="mech" where emp_id =3;
delete from employee_Details where emp_id = 3 ;  


truncate table employee;

drop table employee;