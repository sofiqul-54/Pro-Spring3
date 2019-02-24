package com.sofiqul54.service;

import com.sofiqul54.entity.Student;

import java.util.List;

public interface StudentService {


    void saveOrUpdate(Student student);

    void deleteById(Long id);

    Student findById(Long id);

    Student findByEmail(String email);

    List<Student> getAll();
}
