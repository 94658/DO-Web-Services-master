package com.ics.demo.university.service;

import com.ics.demo.student.model.Student;
import com.ics.demo.university.model.University;

import java.util.List;

public interface UniversityService {

    List<University> findAll();
    University findById(Long id);

    void delete(Long id);

    University createUniversity(University university);
    University updateUniversity(University university);
    University updateUniversity(Long id, University university);

    Student createStudent(Student student);

    Student createStudent(Long id, Student student);
}