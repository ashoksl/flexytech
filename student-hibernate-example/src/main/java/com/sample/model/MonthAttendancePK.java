package com.sample.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by arunv on 13/10/16.
 */
@Embeddable
public class MonthAttendancePK implements Serializable {

    @Column(name="student_id")
    private String studentId;

    @Column(name="month_year")
    private String monthYear;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }

}
