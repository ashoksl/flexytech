package com.sample.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by arunv on 12/10/16.
 */
@Entity
@Table(name="course_details")
public class StudentCourse implements Serializable {

    @Id
    @Column(name="course_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String courseId;

    @Column(name="course_name")
    private String courseName;

    private String department;

    @Column(name="class_location")
    private String classLocation;

    private String hod;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassLocation() {
        return classLocation;
    }

    public void setClassLocation(String classLocation) {
        this.classLocation = classLocation;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }
}
