package com.sample.repository.impl;

import com.sample.model.MonthAttendance;
import com.sample.model.Student;
import com.sample.model.StudentCourse;
import com.sample.repository.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arunv on 11/10/16.
 */
@Repository
public class StudentDaoImpl implements StudentDao{

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    public List<Student> listStudents() {
        Session session = this.sessionFactory.openSession();
        List<Student> studentList = session.createQuery("from Student").list();
        return studentList;
    }

    public Student getStudentData(String studentId) {
        Session session = this.sessionFactory.openSession();
        List<Student> studentList = new ArrayList<Student>();
        Student student = session.get(Student.class,studentId);
        return student;
    }
}
