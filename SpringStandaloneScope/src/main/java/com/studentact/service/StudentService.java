package com.studentact.service;

import java.util.ArrayList;
import java.util.List;

import com.studentact.dao.IStudentDao;
import com.studentact.model.Student;
import com.studentact.proxy.IStudentServiceProxy;

public class StudentService implements IStudentService {
	
	private IStudentDao studentDao;

	private IStudentServiceProxy studentServiceProxy;
	
	public IStudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public IStudentServiceProxy getStudentServiceProxy() {
		return studentServiceProxy;
	}

	public void setStudentServiceProxy(IStudentServiceProxy studentServiceProxy) {
		this.studentServiceProxy = studentServiceProxy;
	}

	@Override
	public List<Student> getTopStudents() {
		List<Student> topStudents = new ArrayList<Student>();
		topStudents.add(studentDao.getGovtStudent());
		topStudents.add(studentServiceProxy.getVOCTopStudent());
		return topStudents;
	}
	
	public void destroy(){
		System.out.println("detroy method of StudentService");
	}
	
	public void init(){
		System.out.println("init method of StudentService");
	}
	
	//Other operations go here

}
