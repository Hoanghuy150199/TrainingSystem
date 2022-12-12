package com.example.trainingsystem.repositories;

import com.example.trainingsystem.models.Trainee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeRepository extends MongoRepository<Trainee, String> {

}
