package com.sample.model;

import javax.persistence.*;

/**
 * Created by arunv on 15/10/16.
 */
@Entity
@Table(name="academic_subject")
public class Subject {

    @Id
    @Column(name="subject_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String subjectId;

    @Column(name="subject_name")
    private String subjectName;

    @Column(name="recommended_books")
    private String recommendedBooks;

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getRecommendedBooks() {
        return recommendedBooks;
    }

    public void setRecommendedBooks(String recommendedBooks) {
        this.recommendedBooks = recommendedBooks;
    }

}
