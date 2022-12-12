package com.example.trainingsystem.controllers;

import com.example.trainingsystem.models.Trainee;
import com.example.trainingsystem.services.TraineeService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TraineeController {
    @Autowired
    TraineeService traineeService;

    @GetMapping("/trainees")
    public List<Trainee> getAllTrainee(){
        return traineeService.getAllTrainee();
    }

    @GetMapping("/trainees/{id}")
    public ResponseEntity<Trainee> getTraineeById(@PathVariable(name = "id") String Id){
        return traineeService.getTraineeById(Id);
    }

    @PostMapping("/trainees")
    public ResponseEntity<Trainee> addTrainee(@Valid @RequestBody Trainee trainee){
        return traineeService.addTrainee(trainee);
    }

    @PutMapping("/trainees/{id}")
    public ResponseEntity<Trainee> updateTrainee(@PathVariable(name = "id") String Id, @Valid @RequestBody Trainee trainee){
        return traineeService.updateTrainee(Id, trainee);
    }

    @DeleteMapping("/trainees/{id}")
    public String removeTraineeById(@PathVariable("id") String Id){
        return traineeService.removeTraineeById(Id);
    }
}
