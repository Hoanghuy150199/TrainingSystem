package com.example.trainingsystem.controllers;

import com.example.trainingsystem.models.Trainee_Course_Management;
import com.example.trainingsystem.services.TCManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TCManagementController {
    @Autowired
    private TCManagementService tcManagementService;

    @GetMapping("/tcManagements")
    public List<Trainee_Course_Management> getAllTCManagements(){
        return tcManagementService.getAllTCManagements();
    }

    @GetMapping("/tcManagements/{id}")
    public ResponseEntity<Trainee_Course_Management> getTCManagementById(@PathVariable(name = "id") String Id){
        return tcManagementService.getTCManagementById(Id);
    }

    @PostMapping("/tcManagements")
    public ResponseEntity<Trainee_Course_Management> addTCManagement(@RequestBody Trainee_Course_Management tcManagement){
        return tcManagementService.addTCManagement(tcManagement);
    }

    @PutMapping("/tcManagements/{id}")
    public ResponseEntity<Trainee_Course_Management> updateTCManagement(@PathVariable(name = "id") String Id, @RequestBody Trainee_Course_Management tcManagement){
        return tcManagementService.updateTCManagement(Id, tcManagement);
    }

    @DeleteMapping("/tcManagements/{id}")
    public String removeTCManagementById(@PathVariable(name = "id") String Id){
        return tcManagementService.removeTCManagementById(Id);
    }
}
