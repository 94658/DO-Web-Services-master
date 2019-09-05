package com.ics.demo.student.controller;

import com.ics.demo.student.model.Student;
import com.ics.demo.student.model.Student.*;
import com.ics.demo.student.service.StudentService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> findAll(){
       return studentService.findAll();
    }

    @GetMapping(value = "{id}")
    public Student findById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @PostMapping
    public Student createStudent(@Validated(Create.class) @RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PatchMapping
    public Student updateStudent(@Validated(Update.class) @RequestBody Student student){
        return  studentService.updateStudent(student);
    }
    @PatchMapping(value = "{id}")
    public Student updateStudent(@Validated(Update.class) @PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping(value = "{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
