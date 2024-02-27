package com.example.Spring.MVC.repository;

import com.example.Spring.MVC.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course, Long> {

}
