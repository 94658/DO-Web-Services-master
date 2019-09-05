package com.ics.demo.student.service;

import com.ics.demo.student.model.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student updateStudent(Student student);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);

    List<Student> findAll();

    Student findById(Long id);
}
