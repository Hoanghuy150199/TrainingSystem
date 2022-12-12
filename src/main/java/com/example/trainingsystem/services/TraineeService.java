package com.example.trainingsystem.services;

import com.example.trainingsystem.models.Trainee;
import com.example.trainingsystem.repositories.TraineeRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TraineeService {
    @Autowired
    TraineeRepository traineeRepository;

    public List<Trainee> getAllTrainee(){
        return traineeRepository.findAll();
    }

    public ResponseEntity<Trainee> getTraineeById(String Id){
        Optional<Trainee> trainee = traineeRepository.findById(Id);
        if(trainee.isPresent()){
            return new ResponseEntity<>(trainee.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Trainee> addTrainee(Trainee trainee){
        try{
            Trainee _trainee = traineeRepository.save(trainee);
            return new ResponseEntity<>(_trainee, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Trainee> updateTrainee(String traineeId, Trainee trainee){
        Optional<Trainee> traineeData = traineeRepository.findById(traineeId);
        if(traineeData.isPresent()){
            trainee.set_id(traineeId);
            return new ResponseEntity<>(traineeRepository.save(trainee), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public String removeTraineeById(String Id){
        Optional<Trainee> trainee = traineeRepository.findById(Id);
        if(trainee.isPresent()){
            traineeRepository.delete(trainee.get());
            return "Deleted successfully";
        }
        else{
            return "NOT FOUND";
        }
    }
}
