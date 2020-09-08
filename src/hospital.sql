DROP database IF EXISTS hospitaldb;
create database hospitaldb;

use hospitaldb;


DROP TABLE IF EXISTS Patient;

CREATE TABLE Patient (	
   p_id int(10) DEFAULT NULL,
   P_name varchar(20) DEFAULT NULL,
   appointment varchar(250));
   
   INSERT INTO Patient VALUES
   (01,'suresh sharma','2018-11-23:21:BP_Test,Calorie_test | 2018-10-23:34:heart test | 2017-06-17:56:kidney test' ),
   (02,'vageesh verma','2018-11-25',22,'Calorie_test'),
   (03,'geeta chand','2018-11-27',23,'LDL_test,BP_Test');
   
   DROP TABLE IF EXISTS Doctor;

CREATE TABLE Doctor (	
   Doc_id int(10) DEFAULT NULL,
   D_name varchar(20) DEFAULT NULL,
   Speciality varchar(50) DEFAULT NULL,
   Availability varchar(100) DEFAULT NULL);
   
   INSERT INTO Doctor VALUES
   (21,'dr_Srivastava','dentist','mon,tues,wed'),
   (22,'dr_radhika','surgeon','tues,fri,mon'),
   (23,'dr_vidhi','cardiologist','fri,wed'),
   (24,'dr_vasu','mds','mon');
   
   