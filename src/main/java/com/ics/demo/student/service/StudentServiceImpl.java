package com.ics.demo.student.service;

import com.ics.demo.NotFoundException;
import com.ics.demo.student.model.Student;
import com.ics.demo.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(()-> new NotFoundException("No university with id "+id+" not found."));
    }
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        Student found = findById(student.getId());
        found.setFname(student.getFname());
        found.setMname(student.getMname());
        found.setLname(student.getLname());
        student.setDob(student.getDob());
        return studentRepository.save(found);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student found = findById(id);
        found.setFname(student.getFname());
        found.setMname(student.getMname());
        found.setLname(student.getLname());
        student.setDob(student.getDob());
        return studentRepository.save(found);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }


}
