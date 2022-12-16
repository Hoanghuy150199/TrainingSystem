package com.example.trainingsystem.services;

import com.example.trainingsystem.models.Skill;
import com.example.trainingsystem.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public List<Skill> getAllSkills(){
        return skillRepository.findAll();
    }

    public ResponseEntity<Skill> getSkillById(String Id){
        Optional<Skill> skill = skillRepository.findById(Id);
        if(skill.isPresent()){
            return new ResponseEntity(skill.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Skill> addSkill(Skill skill){
        try {
            Skill _skill = skillRepository.save(skill);
            return new ResponseEntity<>(_skill, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Skill> updateSkill(String skillId, Skill skill) {
        Optional<Skill> skillData = skillRepository.findById(skillId);
        if (skillData.isPresent()) {
            skill.set_id(skillId);
            return new ResponseEntity<>(skillRepository.save(skill), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public String removeSkillById(String Id){
        Optional<Skill> skill = skillRepository.findById(Id);
        if(skill.isPresent()){
            skillRepository.delete(skill.get());
            return "Deleted successfully";
        }
        else{
            return "NOT FOUND";
        }
    }
}
