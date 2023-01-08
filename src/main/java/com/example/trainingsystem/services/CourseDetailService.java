package com.example.trainingsystem.services;

import com.example.trainingsystem.models.CourseDetail;
import com.example.trainingsystem.repositories.CourseDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseDetailService {
    @Autowired
    private CourseDetailRepository courseDetailRepository;
    public List<CourseDetail> getAllCourseDetails(){
        return courseDetailRepository.findAll();
    }

    public ResponseEntity<CourseDetail> getCourseDetailById(String Id){
        Optional<CourseDetail> courseDetail = courseDetailRepository.findById(Id);
        if(courseDetail.isPresent()){
            return new ResponseEntity<>(courseDetail.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public List<CourseDetail> getCourseDetailsByCourseName(CourseDetail courseDetail){
        List<CourseDetail> courseDetailData = courseDetailRepository.findCourseDetailByCourseName(courseDetail.getCourseName());
        if(courseDetailData.isEmpty()) {
            return null;
        }
        else{
            return courseDetailData;
        }
    }

    public ResponseEntity<CourseDetail> addCourseDetail(CourseDetail courseDetail){
        try{
            CourseDetail _courseDetail = courseDetailRepository.save(courseDetail);
            return new ResponseEntity<>(_courseDetail, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<CourseDetail> updateCourseDetail(String courseId, CourseDetail courseDetail){
        Optional<CourseDetail> courseDetailData = courseDetailRepository.findById(courseId);
        if(courseDetailData.isPresent()){
            courseDetail.set_id(courseId);
            return new ResponseEntity<>(courseDetailRepository.save(courseDetail), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public String removeCourseDetailById(String Id){
        Optional<CourseDetail> courseDetail = courseDetailRepository.findById(Id);
        if(courseDetail.isPresent()){
            courseDetailRepository.delete(courseDetail.get());
            return "Deleted successfully";
        }
        else{
            return "NOT FOUND";
        }
    }

}
