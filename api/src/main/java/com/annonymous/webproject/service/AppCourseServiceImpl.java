package com.annonymous.webproject.service;

import com.annonymous.webproject.entity.AppCourse;
import com.annonymous.webproject.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AppCourseServiceImpl implements AppCourseService{

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public void createCourse(AppCourse appCourse) {
        appCourse.setID(UUID.randomUUID().toString());
        courseRepo.save(appCourse);
    }

    @Override
    public List<AppCourse> getAllCourses() {
        return courseRepo.findAll();
    }


}
