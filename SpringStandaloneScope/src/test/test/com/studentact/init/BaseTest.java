package com.studentact.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	
	//protected ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	protected AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
}
