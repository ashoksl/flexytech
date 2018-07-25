package com.flexy.domain.store;

import com.flexy.domain.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeStore {

    public List<Employee> findAllStudentsWithCourse() {
        List<Employee> employees = new ArrayList<>();
        Employee arun = new Employee();
        arun.setEmployeeId(1);
        arun.setEmployeeName("Arun");
        arun.setGender("M");
        arun.setRole("Developer");
        employees.add(arun);

        Employee ashok = new Employee();
        ashok.setEmployeeId(2);
        ashok.setEmployeeName("Ashok");
        ashok.setGender("M");
        ashok.setRole("Technology Head");
        employees.add(ashok);

        return employees;
    }

}
