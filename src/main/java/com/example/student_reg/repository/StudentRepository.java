package com.example.student_reg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_reg.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
