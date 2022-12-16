package com.example.trainingsystem.repositories;

import com.example.trainingsystem.models.Trainee_Course_Management;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TCManagementRepository extends MongoRepository<Trainee_Course_Management, String> {

}
