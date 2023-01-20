create database user;
use user;
create table Customer(customer_id int primary key,customer_name varchar(30),city varchar(30));
insert into customer values(1,'Abc','pune');
insert into customer (customer_name,city,customer_id)
value('pqr','nashik',2);
insert into Customer values(3,'xyz','mumbai'),
(4,'def','pune'),
(5,'hfg','sangli');
select * from Customer;
desc Customer;
desc emp1;
create table emp1(e_id int primary key,e_name varchar(40),salary int,dob date,dep varchar(30));
insert into emp1 values(1,"Apurwa",45000,"2000-02-15","comp");
insert into emp1 values(2,"Kalyani",45000,"2000-09-03","comp"),
(3,"varun",35000,"2000-05-09","Mech"),
(4,"raj",55000,"2000-04-05","civil");
select * from emp1;
select * from Customer;

SELECT e_id, e_name, city   
   FROM emp1 p inner join Customer c  
   WHERE p.e_id =c.customer_id;  
   
   SELECT e_name, salary, city , dep,e_id ,dob
   FROM emp1 p left join Customer c  
   on p.e_id =c.customer_id; 
   
   SELECT e_id, e_name, dep ,dob ,city ,salary
   FROM emp1 p right join Customer c  
   on p.e_id =c.customer_id; 
   
   SELECT e_id, e_name ,city ,dep ,dob ,city ,salary
   FROM Customer c cross join emp1 p
   on c.customer_id= p.e_id; 