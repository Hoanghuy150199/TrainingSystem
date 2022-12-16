package com.example.trainingsystem.services;

import com.example.trainingsystem.models.Course;
import com.example.trainingsystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public ResponseEntity<Course> getCourseById(String Id){
        Optional<Course> course = courseRepository.findById(Id);
        if(course.isPresent()){
            return new ResponseEntity<>(course.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public List<Course> getCoursesByTrainerInfo(Course course){
        List<Course> courseData = courseRepository.findCoursesByTrainerInfo(course.getTrainerInfo());
        System.out.println(courseData);
        if(courseData.isEmpty()) {
            return null;
        }
        else{
            return courseData;
        }
    }

    public ResponseEntity<Course> addCourse(Course course){
        try{
            Course _course = courseRepository.save(course);
            return new ResponseEntity<>(_course, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Course> updateCourse(String courseId, Course course){
        Optional<Course> courseData = courseRepository.findById(courseId);
        if(courseData.isPresent()){
            course.set_id(courseId);
            return new ResponseEntity<>(courseRepository.save(course), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public String removeCourseById(String Id){
        Optional<Course> course = courseRepository.findById(Id);
        if(course.isPresent()){
            courseRepository.delete(course.get());
            return "Deleted successfully";
        }
        else{
            return "NOT FOUND";
        }
    }
}
