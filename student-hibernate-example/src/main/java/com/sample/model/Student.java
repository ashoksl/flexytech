package com.sample.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by arunv on 11/10/16.
 */

@Entity
@Table(name="student")
public class Student implements Serializable {

    @Id
    @Column(name="student_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String studentId;

    @Column(name="student_name")
    private String studentName;

    @Column(name="date_of_birth")
    private String dob;

    @OneToOne
    @JoinColumn(name="student_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name="course_id")
    private StudentCourse studentCourse;

    @OneToMany(mappedBy = "monthAttendancePK.studentId")
    private Set<MonthAttendance> monthAttendances;

    @ManyToMany
    @JoinTable(name = "student_subject",joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private Set<Subject> subjects;

    public Set<MonthAttendance> getMonthAttendances() {
        return monthAttendances;
    }

    public void setMonthAttendances(Set<MonthAttendance> monthAttendances) {
        this.monthAttendances = monthAttendances;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public StudentCourse getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(StudentCourse studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
