package com.sofiqul54.Controller;

import com.sofiqul54.Entity.Student;
import com.sofiqul54.Entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    static List<Student> list;
    static {
        list = new ArrayList<>();
        list.add(new Student(1L, "Azad", "0167", "123"));
        list.add(new Student(2L, "Mahbub", "0168", "456"));
        list.add(new Student(3L, "Mostafiz", "0169", "789"));
    }

    @GetMapping("/stList")
    public List<Student> getList(){
        return this.list;
    }

    @GetMapping(value = "/student")
    public Student getStudent(){
        return new Student(1L,"Azad","0167", "123");
    }
}
