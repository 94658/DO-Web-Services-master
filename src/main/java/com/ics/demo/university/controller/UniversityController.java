package com.ics.demo.university.controller;

import com.ics.demo.student.model.Student;
import com.ics.demo.university.model.University;
import com.ics.demo.university.model.University.*;
import com.ics.demo.university.service.UniversityService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "universities")
public class UniversityController  {

    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping
    public List<University> findAll(){
        return universityService.findAll();
    }

    @GetMapping(value = "{id}")
    University findById(@PathVariable Long id){
        return universityService.findById(id);
    }

    @PostMapping
    public University createUniversity(@Validated(Create.class) @RequestBody University university){
        return universityService.createUniversity(university);

    }

    @DeleteMapping(value = "{id}")
    public void deleteUniversity(@PathVariable Long id){
        universityService.delete(id);
    }

    @PatchMapping
    public University updateUniversity(@Validated(Update.class) @RequestBody University university){
        return universityService.updateUniversity(university);
    }

    @PatchMapping(value = "{id}")
    public University updateUniversity(@Validated(Update.class) @PathVariable Long id,  @RequestBody University university){
        return universityService.updateUniversity(university);
    }
    @PostMapping(value = "{id}/students")
    public Student createStudent (@PathVariable Long id,@RequestBody Student student){
        return universityService.createStudent (id, student);
    }

}

