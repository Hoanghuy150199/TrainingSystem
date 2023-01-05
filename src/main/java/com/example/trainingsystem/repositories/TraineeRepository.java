package com.example.trainingsystem.repositories;

import com.example.trainingsystem.models.Trainee;
import com.example.trainingsystem.models.enums.TraineeLevel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraineeRepository extends MongoRepository<Trainee, String> {
    @Query(" { 'Level': ?0 } ")
    List<Trainee> findTraineesByLevel(TraineeLevel traineeLevel);
}
