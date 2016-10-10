package com.employee.proxy;

import java.io.IOException;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.transaction.annotation.Transactional;

import com.employee.model.Employee;

public class EmployeeMsgSender {
	
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
	
	@Transactional
	public void convertAndSendEmployee(final Employee employee) {
		jmsTemplate.convertAndSend(destination,employee);
	}

	@Transactional
	public void sendEmployeeToQueue(final Employee employee) {
		System.out.println("Producer sends " + employee);
		ObjectMapper objectMapper = new ObjectMapper();
		String strEmployee = null;
		try {
			strEmployee = objectMapper.writeValueAsString(employee);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		final String employeeMsg = strEmployee;
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session)
					throws JMSException {
				return session.createTextMessage(employeeMsg);
			}
		});
	}
}
