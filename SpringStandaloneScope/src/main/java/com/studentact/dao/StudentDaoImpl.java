package com.studentact.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.studentact.model.Student;

public class StudentDaoImpl implements IStudentDao {
	
	@Autowired
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	//Getting top student from the Govt school
	@Override
	public Student getGovtStudent() {
		//Let's consider that we get this student object from the local DB.
		student.setStudentId("1101");
		student.setStudentName("Arun");
		student.setDob("1999");
		student.setAddress("Madurai");
		student.setStudentCourse("Computation");
		return student;
	}
	
	public void destroy(){
		System.out.println("detroy method of StudentDaoImpl");
	}
	
	public void init(){
		System.out.println("init method of StudentDaoImpl");
	}
	
	//Other operations go here

}
