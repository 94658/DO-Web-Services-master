package com.ics.demo.university.repository;

import com.ics.demo.university.model.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {
}