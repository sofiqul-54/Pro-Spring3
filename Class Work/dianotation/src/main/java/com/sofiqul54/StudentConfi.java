package com.sofiqul54;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfi {

    @Bean(name = "student")
    public  Student getStudent(){
        Student student = new Student(100, "Moly Susmi Rojina");
      return student;
    }

    @Bean(name = "student2")
    public Student getStudentBySetter(){
        Student student = new Student();
        student.setId(500);
        student.setName("Mosta");
        return student;
    }
}
