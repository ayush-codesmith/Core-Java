create database college;
use college;
create table student(
roll_no int primary key,
name varchar(20),
mark int not null,
grade varchar(1),
city varchar(20));

insert into student value
(101,"Anil",78,"c","Pune"),
(102,"Bhumika",98,"A","Mumbai"),
(103,"Chetan",85,"B","Mumbai"),
(104,"Dhruv",96,"A","Dheli"),
(104,"emanual",12,"F","Dheli"),
(104,"farah",82,"B","Dheli");
select * from student;
show databases;
use college;

 
