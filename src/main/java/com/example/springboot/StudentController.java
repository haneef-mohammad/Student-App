package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/students")
    public List<Student> retrieveStudents(){

        return studentService.fetchStudents();
    }
    @GetMapping("/students/{sid}")
    public Student retrieveStudentById(@PathVariable("sid") int sid){
        return studentService.fetchStudentById(sid);
    }
    @PostMapping("/poststudent")
    public String postStudent(@RequestBody Student newStud){
        studentService.addOrUpdateStudent(newStud);
        return "Student Added Successfully!";
    }
    @DeleteMapping("/deletestudents/{sid}")
    public String deleteStudent(@PathVariable("sid") int sid){
        studentService.deleteStudentById(sid);
        return "Student Deleted Successfully!";
    }
}
