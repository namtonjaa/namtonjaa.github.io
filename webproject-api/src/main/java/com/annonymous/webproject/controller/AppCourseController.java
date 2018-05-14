package com.annonymous.webproject.controller;

import com.annonymous.webproject.entity.AppCourse;
import com.annonymous.webproject.service.AppCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/course")
public class AppCourseController {

    @Autowired
    private AppCourseService appCourseService;

    @PostMapping("/create")
    public ResponseEntity<Object> createCourse(@RequestBody AppCourse appCourse){
        appCourseService.createCourse(appCourse);
        return new ResponseEntity<Object>("Course has been created", HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<Object> getAllCourses() {
        return new ResponseEntity<Object>(appCourseService.getAllCourses(), HttpStatus.OK);
    }
}
