package com.flexy.domain.service;

import com.flexy.domain.model.Employee;
import com.flexy.domain.store.EmployeeStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeStore employeeStore;

    public List<Employee> getAllStudents() {
        return employeeStore.findAllStudentsWithCourse();
    }

}
