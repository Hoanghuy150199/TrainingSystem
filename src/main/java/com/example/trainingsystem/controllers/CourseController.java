package com.example.trainingsystem.controllers;

import com.example.trainingsystem.models.Course;
import com.example.trainingsystem.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable(name = "id") String Id){
        return courseService.getCourseById(Id);
    }

    @GetMapping("/courses/TrainerInfo")
    public List<Course> getCoursesByTrainerInfo(@RequestBody Course course){
        return courseService.getCoursesByTrainerInfo(course);
    }

    @GetMapping("/courses/Course")

    @PostMapping("/courses")
    public ResponseEntity<Course> addCourse(@Valid @RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PutMapping("/courses/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable(name = "id") String Id, @Valid @RequestBody Course course){
        return courseService.updateCourse(Id, course);
    }

    @DeleteMapping("/courses/{id}")
    public String removeCourseById(@PathVariable("id") String Id){
        return courseService.removeCourseById(Id);
    }
}
