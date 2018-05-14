package com.annonymous.webproject.service;

import com.annonymous.webproject.entity.AppCourse;

import java.util.List;

public interface AppCourseService {
    void createCourse(AppCourse appCourse);
    List<AppCourse> getAllCourses();
}
