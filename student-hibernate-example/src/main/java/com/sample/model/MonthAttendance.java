package com.sample.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by arunv on 12/10/16.
 */
@Entity
@Table(name="month_attendance")
public class MonthAttendance implements Serializable {

    @EmbeddedId
    private MonthAttendancePK monthAttendancePK;

    @Column(name="percentage")
    private String percentage;

    @Column(name="medical_leaves")
    private String medicalLeaves;

    @Column(name="planned_leaves")
    private String plannedLeaves;

    @Column(name="urgent_leaves")
    private String urgentLeaves;

    public MonthAttendancePK getMonthAttendancePK() {
        return monthAttendancePK;
    }

    public void setMonthAttendancePK(MonthAttendancePK monthAttendancePK) {
        this.monthAttendancePK = monthAttendancePK;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getMedicalLeaves() {
        return medicalLeaves;
    }

    public void setMedicalLeaves(String medicalLeaves) {
        this.medicalLeaves = medicalLeaves;
    }

    public String getPlannedLeaves() {
        return plannedLeaves;
    }

    public void setPlannedLeaves(String plannedLeaves) {
        this.plannedLeaves = plannedLeaves;
    }

    public String getUrgentLeaves() {
        return urgentLeaves;
    }

    public void setUrgentLeaves(String urgentLeaves) {
        this.urgentLeaves = urgentLeaves;
    }

}