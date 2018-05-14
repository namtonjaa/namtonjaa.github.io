package com.annonymous.webproject.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPCOURSE")
public class AppCourse {

    @Id
    @Column(name="ID")
    @JsonIgnore
    private String ID;

    @Column(name="COURSEID")
    private int courseId;

    @Column(name="COURSENAME")
    private String courseName;

    @Column(name="PROFESSORNAME")
    private String professorName;

    @Column(name="SEMESTER")
    private int semester;

    @Column(name="CREDIT")
    private int credit;

    @Column(name="SEAT")
    private int seat;

    public AppCourse() {
    }

    public AppCourse(String ID, int courseId, String courseName, String professorName, int semester, int credit, int seat) {
        this.ID = ID;
        this.courseId = courseId;
        this.courseName = courseName;
        this.professorName = professorName;
        this.semester = semester;
        this.credit = credit;
        this.seat = seat;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}


