package com.studentact.model;

public class Student {
	
    private String studentId;

	private String studentName;

    private String dob;

    private String address;

    private String studentCourse;
    
    private String StudentMarks;

    public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	@Override
	public String toString() {
		return "\n"+super.toString()+" : \nstudentId : "+studentId+" : studentName : "+studentName+" : dob : "+dob+" : address : "+address+" : studentCourse : "+studentCourse+"\n";
	}
	
	public void destroy(){
		System.out.println("detroy method of Student");
	}
	
	public void init(){
		System.out.println("init method of Student");
	}
	
}
