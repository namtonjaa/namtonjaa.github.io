package com.annonymous.webproject.repository;

import com.annonymous.webproject.entity.AppCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<AppCourse, Long> {

}
