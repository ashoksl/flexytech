package com.studentact.proxy;

import org.springframework.beans.factory.annotation.Autowired;

import com.studentact.model.Student;

public class StudentServiceProxy implements IStudentServiceProxy {
	
	@Autowired
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	//Getting top student from the voc school
	@Override
	public Student getVOCTopStudent(){
		//Let's consider that we get this comma separated values from an external web service.
		String studentCSV = "1103,Ashok,2002,Chennai,DataScience";
		String[] studentData = studentCSV.split(",");
		student.setStudentId(studentData[0]);
		student.setStudentName(studentData[1]);
		student.setDob(studentData[2]);
		student.setAddress(studentData[3]);
		student.setStudentCourse(studentData[4]);
		return student;
	}
	
	public void destroy(){
		System.out.println("detroy method of StudentServiceProxy");
	}
	
	public void init(){
		System.out.println("init method of StudentServiceProxy");
	}
	
	//Other operations go here
	
}
