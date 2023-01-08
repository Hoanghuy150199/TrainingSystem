package com.example.trainingsystem.controllers;

import com.example.trainingsystem.models.CourseDetail;
import com.example.trainingsystem.services.CourseDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/api/v1")
public class CourseDetailController {
    @Autowired
    private CourseDetailService courseDetailService;

    @GetMapping("/courseDetails")
    public List<CourseDetail> getAllCourseDetails(){
        return courseDetailService.getAllCourseDetails();
    }

    @GetMapping("/courseDetails/{id}")
    public ResponseEntity<CourseDetail> getCourseDetailById(@PathVariable(name = "id") String Id){
        return courseDetailService.getCourseDetailById(Id);
    }

    @GetMapping("/courseDetails/CourseDetailName")
    public List<CourseDetail> getCourseDetailsByCourseName(@RequestBody CourseDetail courseDetail){
        return courseDetailService.getCourseDetailsByCourseName(courseDetail);
    }

    @PostMapping("/courseDetails")
    public ResponseEntity<CourseDetail> addCourseDetail(@Valid @RequestBody CourseDetail courseDetail){
        return courseDetailService.addCourseDetail(courseDetail);
    }

    @PutMapping("/courseDetails/{id}")
    public ResponseEntity<CourseDetail> updateCourseDetail(@PathVariable(name = "id") String Id, @Valid @RequestBody CourseDetail courseDetail){
        return courseDetailService.updateCourseDetail(Id, courseDetail);
    }

    @DeleteMapping("/courseDetails/{id}")
    public String removeCourseDetailById(@PathVariable("id") String Id){
        return courseDetailService.removeCourseDetailById(Id);
    }
}
