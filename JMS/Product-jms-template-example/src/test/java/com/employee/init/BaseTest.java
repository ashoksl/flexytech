package com.employee.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	
	protected ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
}
