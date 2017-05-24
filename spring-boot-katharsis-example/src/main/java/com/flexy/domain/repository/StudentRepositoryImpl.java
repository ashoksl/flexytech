package com.flexy.domain.repository;

import com.flexy.domain.model.Student;
import com.flexy.domain.service.StudentService;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryBase;
import io.katharsis.resource.list.DefaultResourceList;
import io.katharsis.resource.list.ResourceList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRepositoryImpl extends ResourceRepositoryBase<Student, Long> {

    protected StudentRepositoryImpl() {
        super(Student.class);
    }

    @Autowired
    private StudentService studentService;

    @Override
    public ResourceList<Student> findAll(QuerySpec querySpec) {
        ResourceList<Student> studentResourceList = new DefaultResourceList<>();
        List<Student> students = studentService.getAllStudents();
        studentResourceList.addAll(students);
        return studentResourceList;
    }
}
