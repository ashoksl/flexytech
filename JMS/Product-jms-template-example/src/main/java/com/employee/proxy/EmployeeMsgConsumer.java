package com.employee.proxy;

import java.io.IOException;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.jms.core.JmsTemplate;

import com.employee.model.Employee;

public class EmployeeMsgConsumer {
	
	private JmsTemplate jmsTemplate;
	private Destination destination;

	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	public Employee receiveAndConvertEmployee(){
		Employee employee = (Employee) jmsTemplate
				.receiveAndConvert(destination);
		return employee;
	}

	public Employee getNewEmployeeMsg(){
		TextMessage textMessage = (TextMessage) jmsTemplate
				.receive(destination);
		String employeeMsg = null;
		try {
			employeeMsg = textMessage.getText();
		} catch (JMSException e1) {
			e1.printStackTrace();
		}
		ObjectMapper objectMapper = new ObjectMapper();
		Employee employee = null;
		try {
			employee = objectMapper.readValue(employeeMsg, Employee.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
}
