package com.example.trainingsystem.repositories;

import com.example.trainingsystem.models.CourseDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDetailRepository extends MongoRepository<CourseDetail, String> {
    @Query(" { 'CourseName': ?0 } ")
    List<CourseDetail> findCourseDetailByCourseName(String CourseName);
}
