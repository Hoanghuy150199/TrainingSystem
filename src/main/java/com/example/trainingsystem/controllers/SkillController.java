package com.example.trainingsystem.controllers;

import com.example.trainingsystem.models.Skill;
import com.example.trainingsystem.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SkillController {
    @Autowired
    private SkillService skillService;

    @GetMapping("/skills")
    public List<Skill> getAllSkills(){
        return skillService.getAllSkills();
    }

    @GetMapping("/skills/{id}")
    public ResponseEntity<Skill> getSkillById(@PathVariable(name = "id") String Id){
        return skillService.getSkillById(Id);
    }

    @PostMapping("/skills")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill){
        return skillService.addSkill(skill);
    }

    @PutMapping("/skills/{id}")
    public ResponseEntity<Skill> updateSkill(@PathVariable(name = "id") String Id, @RequestBody Skill skill){
        return skillService.updateSkill(Id, skill);
    }

    @DeleteMapping("/skills/{id}")
    public String removeSkillById(@PathVariable(name = "id") String Id){
        return skillService.removeSkillById(Id);
    }
}