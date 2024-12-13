package com.example.student_reg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.student_reg.model.Student;
import com.example.student_reg.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student insertStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudentInfo() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Long id, Student studentDetail) {
        Optional<Student> studOptional = studentRepository.findById(id);
        if (studOptional.isPresent()) {
            Student student = studOptional.get();
            student.setFullName(studentDetail.getFullName());
            student.setDepartment(studentDetail.getDepartment());
            student.setSemester(studentDetail.getSemester());
            student.setYear(studentDetail.getYear());
            return studentRepository.save(student);
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }
    public void studentDelete(Long id){
        studentRepository.deleteById(id);
    }
}