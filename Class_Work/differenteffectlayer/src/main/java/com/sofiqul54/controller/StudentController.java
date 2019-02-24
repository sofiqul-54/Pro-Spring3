package com.sofiqul54.controller;

import com.sofiqul54.entity.Student;
import com.sofiqul54.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/test/{id}")
    public Student getStudent(@PathVariable ("id") Long id){
        return studentService.findById(id);
    }

    @GetMapping(value = "/list")
    public List<Student> getStudent(){
        return studentService.getAll();
    }
}
