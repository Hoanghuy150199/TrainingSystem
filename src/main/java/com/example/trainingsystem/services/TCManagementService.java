package com.example.trainingsystem.services;

import com.example.trainingsystem.models.Trainee_Course_Management;
import com.example.trainingsystem.repositories.TCManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TCManagementService {
    @Autowired
    private TCManagementRepository tcManagementRepository;
    public List<Trainee_Course_Management> getAllTCManagements(){
        return tcManagementRepository.findAll();
    }

    public ResponseEntity<Trainee_Course_Management> getTCManagementById(String Id){
        Optional<Trainee_Course_Management> tcManagement = tcManagementRepository.findById(Id);
        if(tcManagement.isPresent()){
            return new ResponseEntity(tcManagement.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Trainee_Course_Management> addTCManagement(Trainee_Course_Management tcManagement){
        try {
            Trainee_Course_Management _tcManagement = tcManagementRepository.save(tcManagement);
            return new ResponseEntity<>(_tcManagement, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Trainee_Course_Management> updateTCManagement(String tcManagementId, Trainee_Course_Management tcManagement) {
        Optional<Trainee_Course_Management> tcManagementData = tcManagementRepository.findById(tcManagementId);
        if (tcManagementData.isPresent()) {
            tcManagement.set_id(tcManagementId);
            return new ResponseEntity<>(tcManagementRepository.save(tcManagement), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public String removeTCManagementById(String Id){
        Optional<Trainee_Course_Management> tcManagement = tcManagementRepository.findById(Id);
        if(tcManagement.isPresent()){
            tcManagementRepository.delete(tcManagement.get());
            return "Deleted successfully";
        }
        else{
            return "NOT FOUND";
        }
    }

}
