package com.sjprogramming.restapi.controller;

import com.sjprogramming.restapi.entity.Student;
import com.sjprogramming.restapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> student = repo.findAll();

        return student;

    }

    @PostMapping("/student/add")
    public void createStudent(@RequestBody Student student){

        repo.save(student);
    }

}
