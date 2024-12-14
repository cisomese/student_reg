package com.example.student_reg.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student_reg.model.Student;
import com.example.student_reg.service.StudentService;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        //TODO: process POST request
        return studentService.insertStudent(student);
    }

    @GetMapping("/show")
    public List<Student> getStudInfo() {
        return studentService.getStudentInfo();
    }
    
    @PutMapping("update/{id}")
    public Student updateStud(@PathVariable Long id, @RequestBody Student student) {
        //TODO: process PUT request
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        try {
            studentService.studentDelete(id); 
            return ResponseEntity.noContent().build(); 
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build(); 
        }
    }
}
