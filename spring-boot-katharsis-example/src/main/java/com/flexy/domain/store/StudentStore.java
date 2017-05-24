package com.flexy.domain.store;

import com.flexy.domain.model.Course;
import com.flexy.domain.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentStore {

    public List<Student> findAllStudentsWithCourse() {
        List<Student> students = new ArrayList<>();
        Student arun = new Student();
        arun.setStudentId(1);
        arun.setStudentName("Arun");
        arun.setGender("M");
        arun.setCourses(findAllCourses());
        students.add(arun);

        Student ashok = new Student();
        ashok.setStudentId(2);
        ashok.setStudentName("Ashok");
        ashok.setGender("M");
        ashok.setCourses(findAllCourses());
        students.add(ashok);

        return students;
    }

    public List<Course> findAllCourses() {
        List<Course> courses = new ArrayList<>();

        Course aws = new Course();
        aws.setCourseId(1);
        aws.setCourseName("AWS");
        courses.add(aws);

        Course dataScience = new Course();
        dataScience.setCourseId(2);
        dataScience.setCourseName("Data Science");
        courses.add(dataScience);

        return courses;
    }

}
