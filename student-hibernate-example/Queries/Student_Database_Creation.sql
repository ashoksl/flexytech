/*use usersproduct;*/

/*drop table month_attendance;
drop table student_subject;
drop table academic_subject;
drop table student;
drop table course_details;*/



create table course_details(course_id MEDIUMINT NOT NULL AUTO_INCREMENT,
	course_name varchar(20) not null,department varchar(20),class_location varchar(20),
    hod varchar(20),
	PRIMARY KEY (course_id));

insert into course_details(course_name,department,class_location,hod)
values("CSE","Science","BLK1-room2","Kumar");

insert into course_details(course_name,department,class_location,hod)
values("IT","Engineering","BLK4-room5","Veeran");

insert into course_details(course_name,department,class_location,hod)
values("EEE","PHD","BLK5-room1","Ramanujan");

create table student(student_id MEDIUMINT NOT NULL AUTO_INCREMENT,course_id MEDIUMINT not null,
	student_name varchar(100),date_of_birth datetime,
    PRIMARY KEY (student_id),
    FOREIGN KEY (course_id) REFERENCES course_details(course_id));
    
insert into student(student_name,date_of_birth,course_id)
values("Arun","1998-11-28",1);

insert into student(student_name,date_of_birth,course_id)
values("Ashok","2000-09-21",1);

insert into student(student_name,date_of_birth,course_id)
values("Sukumar","1999-07-18",2);

insert into student(student_name,date_of_birth,course_id)
values("Saranraj","2000-03-11",3);


create table month_attendance(student_id MEDIUMINT not null,month_year varchar(10),percentage varchar(5),
	medical_leaves integer,planned_leaves integer,urgent_leaves integer,
    PRIMARY KEY (student_id,month_year),
    FOREIGN KEY (student_id) REFERENCES student(student_id));

insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(1,"APR2016","70",2,2,3);

insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(1,"MAY2016","90",1,0,0);

insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(1,"JUN2016","87",0,0,1);



insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(2,"APR2016","95",1,1,0);

insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(2,"MAY2016","90",1,1,1);

insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(2,"JUN2016","97",0,0,1);



insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(3,"APR2016","85",2,0,3);

insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(3,"MAY2016","93",1,1,0);

insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(3,"JUN2016","90",0,1,2);




insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(4,"APR2016","99",0,0,0);

insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(4,"MAY2016","94",1,1,1);

insert into month_attendance(student_id,month_year,percentage,medical_leaves,planned_leaves,urgent_leaves)
values(4,"JUN2016","89",1,0,1);

create table academic_subject(subject_id MEDIUMINT NOT NULL AUTO_INCREMENT,
	subject_name varchar(100),recommended_books varchar(100),
    PRIMARY KEY (subject_id));
    
insert into academic_subject(subject_name,recommended_books)
values("Java","SCJP");

insert into academic_subject(subject_name,recommended_books)
values("Spring","Getting Started with Spring");

insert into academic_subject(subject_name,recommended_books)
values("Design patterns","Head first design patterns");

insert into academic_subject(subject_name,recommended_books)
values("OOAD","Head first object oriented analysis and design");

insert into academic_subject(subject_name,recommended_books)
values("DSP","Digital Signal processing");
    
insert into academic_subject(subject_name,recommended_books)
values("EE","Electrical Circuits");

create table student_subject(student_subject_id MEDIUMINT NOT NULL AUTO_INCREMENT,
	subject_id MEDIUMINT not null,student_id MEDIUMINT not null,
    PRIMARY KEY (student_subject_id),
    FOREIGN KEY (student_id) REFERENCES student(student_id),
    FOREIGN KEY (subject_id) REFERENCES academic_subject(subject_id));

insert into student_subject(student_id,subject_id)
values("1","1");

insert into student_subject(student_id,subject_id)
values("1","2");

insert into student_subject(student_id,subject_id)
values("1","3");

insert into student_subject(student_id,subject_id)
values("2","2");

insert into student_subject(student_id,subject_id)
values("2","3");

insert into student_subject(student_id,subject_id)
values("2","4");

insert into student_subject(student_id,subject_id)
values("3","1");

insert into student_subject(student_id,subject_id)
values("3","3");

insert into student_subject(student_id,subject_id)
values("3","5");

insert into student_subject(student_id,subject_id)
values("4","1");

insert into student_subject(student_id,subject_id)
values("4","5");

insert into student_subject(student_id,subject_id)
values("4","6");

/*commit;*/
