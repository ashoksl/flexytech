package com.employee.proxy;

import org.junit.Assert;
import org.junit.Test;

import com.employee.init.BaseTest;
import com.employee.model.Employee;

public class EmployeeMsgSenderTest extends BaseTest {

	@Test
	public void testSendEmployeeToQueue() {
		
		EmployeeMsgSender employeeMsgSender = (EmployeeMsgSender) applicationContext.getBean("employeeMsgSender");
		Employee employee = new Employee();
		employee.setAge("33");
		employee.setEmployeeId("1135");
		employee.setEmployeeName("Veeran");
		employee.setExperience("10");
		employeeMsgSender.sendEmployeeToQueue(employee);
		
		EmployeeMsgConsumer employeeMsgConsumer = (EmployeeMsgConsumer) applicationContext.getBean("employeeMsgConsumer");
		Employee receiveEmployee = employeeMsgConsumer.getNewEmployeeMsg();
		Assert.assertTrue(employee.equals(receiveEmployee));
		
	}

}
