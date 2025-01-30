create database SQL_Exercise1;

create table REGIONS(
regions_id integer
,regions_name varchar(20)
);

Alter table countries
rename column countries_id to country_id;

Alter table countries
modify column countries_id char(2);

Alter table countries
rename column countries_name to country_name;
select * from countries;
create table COUNTRIES(
countries_id integer
,countries_name varchar(40)
,regions_id integer
);


select * from locations;
create table LOCATIONS(
location_id integer
,street_address varchar(25)
,postal_code varchar(12)
,city varchar(30)
,state_province varchar(12)
,country_id char(2)
);

DROP TABLE departments;
create table DEPARTMENTS(
DEPARTMENT_ID integer
,DEPARTMENT_NAME varchar(30)
,MANAGER_ID integer
,LOCATION_ID integer
);

select * from job_history; 

create table JOB_HISTORY(
employee_id integer
,start_date date
,end_date date
,job_id varchar(10)
,department_id integer
);

ALTER TABLE JOBS
MODIFY COLUMN MIN_SALARY DECIMAL(7,2), modify COLUMN MAX_SALARY DECIMAL(7,2);
create table JOBS(
job_id varchar(10)
,job_title varchar(35)
,min_salary integer
,max_salary integer
);

DROP TABLE JOB_GRADES
create table JOB_GRADES(
grade_level varchar(2)
,lowest_sal integer
,highest_sal integer
);

alter TABLE EMPLOYEES
MODIFY COLUMN SALARY DECIMAL(7,2), MODIFY COLUMN COMMISSION_PCT DECIMAL(7,2);
DROP TABLE employees;
create table EMPLOYEES(
EMPLOYEE_ID integer
,FIRST_NAME varchar(20)
,LAST_NAME varchar(25)
,EMAIL varchar(25)
,PHONE_NUMBER varchar(20)
,HIRE_DATE date
,JOB_ID varchar(10)
,SALARY integer
,COMMISSION_PCT integer
,MANAGER_ID integer
,DEPARTMENT_ID integer
);

ALTER TABLE MANAGERS
rename COLUMN ID TO EMPLOYEE_ID;
ALTER TABLE MANAGERS
DROP COLUMN EMPLOYEE_ID;
Alter table managers
modify column salary decimal(7,2);
create table MANAGERS(
MANAGER_ID integer
,FIRST_NAME varchar(20)
,LAST_NAME varchar(25)
,EMAIL varchar(25)
,PHONE_NUMBER varchar(20)
,HIRE_DATE date
,JOB_ID varchar(10)
,SALARY integer
,COMMISSION_PCT integer
,ID integer
,DEPARTMENT_ID integer
);


ALTER TABLE regions ADD CONSTRAINT pk_regions_id PRIMARY KEY (regions_id);
Alter table countries add constraint fk_regions_id foreign key (regions_id) references regions(regions_id);
select * from regions order by regions_id; 
delete from regions where regions_name = 'sia';
insert into regions values(1, 'Europe');
insert into regions values(2, 'Asia');
insert into regions values(3, 'America');

Alter table countries add constraint pk_country_id primary key (country_id);
alter table locations add constraint fk_country_id foreign key (country_id) references countries(country_id);
drop table countries;

set foreign_key_checks= 1; 
delete from countries;
insert into countries values('DE', 'Germany', 1);
insert into countries values('IT', 'Italy', 1);
insert into countries values('US', 'United State', 2);
insert into countries values('JP', 'Japan', 3);

Alter table locations add constraint pk_location_id primary key (location_id);
Alter table departments add constraint fk_location_id foreign key (location_id) references locations(location_id);
delete from locations;
insert into locations values(1000, '1297 Via Cola di Rie', 989, 'Roma', 'Lazio', 'IT');
insert into locations values(1100, '93091 Calle della Ta', 10934, 'Venice', 'Veneto', 'IT');
insert into locations values(1200, '2017 Shinjuku-ku', 1689, 'Tokyo', 'Tokyo JP', 'JP');
insert into locations values(1400, '2014 Jabberwocky Rd', 26192, 'Southlake', 'Texas', 'US');

Alter table departments add constraint pk_department_id primary key (department_id);
Alter table employees add constraint fk_department_id foreign key (department_id) references departments(department_id);
Alter table job_history add constraint fk_department_id_jobHistory foreign key (department_id) references departments(department_id);
ALTER TABLE MANAGERS ADD CONSTRAINT FK_DEPARTMENT_ID_MANAGERS FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID);
select * from departments;
insert into departments values(10, 'Administration', 200, 1100);
insert into departments values(20, 'Marketing', 201, 1200);
insert into departments values(30, 'Purchasing', 202, 1400);


select EMPLOYEE_ID, FIRST_NAME, LAST_NAME, UPPER(email) as EMAIL, PHONE_NUMBER, 
HIRE_DATE, UPPER(JOB_ID) as JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID
from employees;
Alter table employees add constraint pk_employee_id primary key (employee_id);
Alter table job_history add constraint fk_employee_id foreign key (employee_id) references employees(employee_id);
insert into employees values(100, 'Steven', 'King', 'sking', '515-1234567', '1987-06-17', 'ST_clerk', 24000.00, 0.00, 109, 10);
insert into employees values(101, 'Neena', 'kochhar', 'nkochhar', '515-1234568', '1987-06-18', 'mk_rep', 17000.00, 0.00, 103, 20);
insert into employees values(102, 'Lex', 'De Haan', 'ldehaan', '515-1234569', '1987-06-19', 'it_prog', 17000.00, 0.00, 108, 30);
insert into employees values(103, 'Alexander', 'Hunold', 'ahunold', '590-4234567', '1987-06-20', 'mk_rep', 9000.00, 0.00, 105, 20);

SELECT * FROM MANAGERS;
ALTER TABLE MANAGERS ADD CONSTRAINT PK_MANAGER_ID PRIMARY KEY (MANAGER_ID);
ALTER TABLE EMPLOYEES ADD CONSTRAINT FK_MANAGER_ID FOREIGN KEY (MANAGER_ID) REFERENCES MANAGERS(MANAGER_ID);
insert into MANAGERS values(103, 'Emma', 'Smith', 'ESMITH', '515-7654321', '1967-01-17', 'MK_REP', 24000.00, 0.00, 20);
insert into MANAGERS values(105, 'LIAM', 'JOHNSON', 'LJOHNSON', '515-7654322', '1967-06-18', 'MK_REP', 24000.00, 0.00, 20);
insert into MANAGERS values(108, 'SOPHIA', 'BROWN', 'SBROWN', '515-7654323', '1967-06-19', 'IT_PROG', 30000.00, 0.00, 30);
insert into MANAGERS values(109, 'NOAH', 'DAVIS', 'NDAVIS', '515-7654324', '1967-06-20', 'ST_CLERK', 35000.00, 0.00, 10);
insert into MANAGERS values(200, 'OLIVIA', 'MARTINEZ', 'OMARITNEZ', '515-7654325', '1967-06-21', 'ST_CLERK', 35000.00, 0.00, 10);
insert into MANAGERS values(201, 'WILLIAM', 'GARCIA', 'WGARCIA', '515-7654326', '1967-06-22', 'MK_REP', 24000.00, 0.00, 20);
insert into MANAGERS values(202, 'AVA', 'RODRIGUEZ', 'ARODRIGUEZ', '515-7654327', '1967-06-23', 'IT_PROG', 30000.00, 0.00, 30);

SELECT * FROM job_history;

insert into job_history values(102, '1993-01-13', '1998-07-24', 'IT_PROG', 20);
insert into job_history values(101, '1989-09-21', '1993-10-27', 'MK_REP', 10);
insert into job_history values(101, '1993-10-28', '1997-03-15', 'MK_REP', 30);
insert into job_history values(100, '1996-02-17', '1999-12-19', 'ST_CLERK', 30);
insert into job_history values(103, '1998-03-24', '1999-12-31', 'MK_REP', 20);

Alter table jobs add constraint pk_job_id primary key (job_id);
Alter table employees add constraint fk_job_id foreign key (job_id) references jobs(job_id);
Alter table job_history add constraint fk_job_id_jobHistory foreign key (job_id) references jobs(job_id);
SELECT * FROM jobS;
INSERT INTO JOBS VALUES('IT_PROG', 'IT PROGRAMMER', 17000.00, 17000.00);
INSERT INTO JOBS VALUES('MK_REP', 'MARKETING REPRESENTIVE', 9000.00, 17000.00);
INSERT INTO JOBS VALUES('ST_CLERK', 'SALES CLERK', 24000.00, 24000.00);


-- answwer for question 3 to 12
-- 3. 
select l.location_id, l.street_address, l.city, l.state_province, c.country_name
from countries c inner join locations l on c.country_id = l.country_id
 group by l.location_id, l.street_address, l.city, l.state_province, c.country_name;
 
 -- 4. 
 select first_name, last_name, department_id
 from employees;

-- 5. 
 select e.first_name, e.last_name, e.department_id, e.job_id
 from employees e 
 inner join departments d on e.department_id = d.department_id
 inner join locations l on d.location_id = l.location_id
 inner join countries c on l.country_id = c.country_id
 where c.country_name like 'Japan'
 group by e.first_name, e.last_name, e.department_id, e.job_id;
 
 -- 6. 
  select e.last_name, e.employee_id,  M.manager_id, m.last_name as manager_lastName
 from employees e INNER JOIN MANAGERS M ON M.MANAGER_ID = E.MANAGER_ID;
 
 -- 7.
 select e.first_name, e.last_name, e.hire_date
 from employees e
 where e.hire_date > '1987-06-19'
 group by e.first_name, e.last_name, e.hire_date;
 
 -- 8. 
 select d.department_name, count(1) as employees_of_each_department
 from employees e inner join departments d on d.department_id = e.department_id
 group by d.department_name;
 
 -- 9.
 select e.employee_id, j.job_title, j.job_id, datediff(jh.end_date, jh.start_date) as numbers_of_days 
 from employees e
 inner join jobs j on j.job_id = e.job_id
 inner join job_history jh on e.employee_id = jh.employee_id
where jh.department_id = 30 
 group by e.employee_id, j.job_title, j.job_id, datediff(jh.end_date, jh.start_date);
 
 -- 10
 select d.department_name, concat(m.first_name,' ', m.last_name) as manager_name, l.city, c.country_name
 from managers m
 inner join departments d on d.department_id = m.department_id
 inner join locations l on l.location_id = d.location_id
 inner join countries c on c.country_id = l.country_id
 group by d.department_name, concat(m.first_name,' ', m.last_name), l.city, c.country_name;
 
 -- 11
SELECT total_salary_from_managers_and_employees.department_name, round(AVG(total_sum),2) AS avg_salary_for_departments
FROM (
    SELECT d.department_name, SUM(m.salary) + SUM(e.salary) AS total_sum
    FROM employees e
    INNER JOIN managers m ON m.manager_id = e.manager_id
    INNER JOIN departments d ON d.department_id = e.department_id
    GROUP BY d.department_name
) AS total_salary_from_managers_and_employees
GROUP BY total_salary_from_managers_and_employees.department_name;

-- 12
create table new_jobs(
JOB_ID varchar(10)
,JOB_TITLE varchar(35)
);
 

 ALTER TABLE NEW_JOBS ADD CONSTRAINT PK_NEW_JOBS PRIMARY KEY (JOB_ID);
 ALTER TABLE JOB_GRADES ADD CONSTRAINT FK_JOB_ID_JOBGRADES FOREIGN KEY (JOB_ID) REFERENCES NEW_JOBS(JOB_ID);
 INSERT INTO NEW_JOBS VALUES('IT_PROG', 'IT PROGRAMMER');
 INSERT INTO NEW_JOBS VALUES('MK_REP', 'MARKETING REPRESENTIVE');
 INSERT INTO NEW_JOBS VALUES('ST_CLERK', 'SALES CLERK');
 
 create table job_grades(
 GRADE_LEVEL VARCHAR(2)
 ,MIN_SALARY INTEGER
 ,MAX_SALARY INTEGER
 ,JOB_ID VARCHAR(10)
 );
 
INSERT INTO job_grades VALUES('A', 25000, 30000, 'IT_PROG');
INSERT INTO job_grades VALUES('B', 15000, 20000, 'IT_PROG');
INSERT INTO job_grades VALUES('A', 23000, 31000, 'MK_REP');
INSERT INTO job_grades VALUES('B', 9000, 18000, 'MK_REP');
INSERT INTO job_grades VALUES('A', 30000, 40000, 'ST_CLERK');
INSERT INTO job_grades VALUES('B', 20000, 30000, 'ST_CLERK');


