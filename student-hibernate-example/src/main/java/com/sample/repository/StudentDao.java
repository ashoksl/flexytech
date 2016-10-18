package com.sample.repository;

import com.sample.model.MonthAttendance;
import com.sample.model.Student;
import com.sample.model.StudentCourse;

import java.util.List;

/**
 * Created by arunv on 11/10/16.
 */
public interface StudentDao {

    public List<Student> listStudents();

    public Student getStudentData(String studentId);

}
