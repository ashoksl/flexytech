package com.sample.services.impl;

import com.sample.model.MonthAttendance;
import com.sample.model.Student;
import com.sample.model.StudentCourse;
import com.sample.repository.StudentDao;
import com.sample.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.PathParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by arunv on 11/10/16.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public Map<String, List<Student>> getAllStudents() {
        Map<String, List<Student>> studentsResult = new HashMap<String, List<Student>>();
        studentsResult.put("students",studentDao.listStudents());
        return studentsResult;
    }

    public Map<String, Student> getAllStudentsByCourse(String studentId) {
        Map<String, Student> studentData = new HashMap<String, Student>();
        studentData.put(studentId,studentDao.getStudentData(studentId));
        return studentData;
    }


}
