package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    //private static final List<Student> students= new ArrayList<>();
    @Autowired
    StudentRepository repository;

//    static{
//        Student mike = new Student(101,"Mike","9987282711","Java");
//        Student dolly = new Student(102,"Dolly","8217782112","Python");
//        students.add(mike);
//        students.add(dolly);
//    }

    public List<Student> fetchStudents(){
        List<Student> students = new ArrayList<Student>();
        repository.findAll().forEach(student -> students.add(student));
        return students;
    }

    public Student fetchStudentById(int sid) {
        return repository.findById(sid).get();
    }

    public void addOrUpdateStudent(Student student){
        repository.save(student);
    }

    public void deleteStudentById(int sid){
        repository.deleteById(sid);
    }


}
