package com.studentact.service;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.studentact.init.BaseTest;
import com.studentact.model.Student;

public class StudentServiceTest extends BaseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTopStudents() {
		
		applicationContext.registerShutdownHook();
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		List<Student> students = studentService.getTopStudents();
		System.out.println(students);
		Student aStudent = null;
		for(Student student:students){
			if(null == aStudent){
				aStudent = student;				
			} else if(student == aStudent) {
				Assert.assertFalse(true);
			}
		}
	}

}
