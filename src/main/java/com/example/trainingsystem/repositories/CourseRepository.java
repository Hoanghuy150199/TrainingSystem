package com.example.trainingsystem.repositories;

import com.example.trainingsystem.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
    @Query(" { 'TrainerInfo': ?0 } ")
    List<Course> findCoursesByTrainerInfo(String TrainerInfo);

    @Query(" { 'CourseName': ?0 } ")
    List<Course> findCoursesByCourseName(String CourseName);
}
