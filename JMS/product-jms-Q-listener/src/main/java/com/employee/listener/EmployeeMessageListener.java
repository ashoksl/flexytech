package com.employee.listener;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.codehaus.jackson.map.ObjectMapper;

import com.employee.model.Employee;

public class EmployeeMessageListener implements MessageListener {

	@Override
	public void onMessage(Message arg0) {
		Employee employee = null;
		ObjectMapper objectMapper = new ObjectMapper();
		ActiveMQTextMessage activeMQTxtMsg = (ActiveMQTextMessage) arg0;
		try {
			String employeeMsg = activeMQTxtMsg.getText();
			employee = objectMapper.readValue(employeeMsg, Employee.class);
		} catch (JMSException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("Received Employee Object is : "+employee);
	}

}
