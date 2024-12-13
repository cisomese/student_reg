package com.example.student_reg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String department;
    private String year;
    private int semester;

    public void setSemester(int semester) {
        this.semester = semester;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public Long getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getDepartment() {
        return department;
    }
    public String getYear() {
        return year;
    }
    public int getSemester() {
        return semester;
    }

    
}
