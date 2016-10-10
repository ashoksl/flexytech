package com.employee.converters;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

import com.employee.model.Employee;

public class EmployeeConverter implements MessageConverter{

	@Override
	public Object fromMessage(Message arg0) throws JMSException,
			MessageConversionException {
		Employee employee = null;
		ObjectMapper objectMapper = new ObjectMapper();
		ActiveMQTextMessage activeMQTxtMsg = (ActiveMQTextMessage) arg0;
		try {
			String employeeMsg = activeMQTxtMsg.getText();
			employee = objectMapper.readValue(employeeMsg, Employee.class);
		} catch (JMSException | IOException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public Message toMessage(Object arg0, Session arg1) throws JMSException,
			MessageConversionException {
		Employee employee = (Employee) arg0;
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
		Message message = arg1.createTextMessage(strEmployee);
		return message;
	}

}
