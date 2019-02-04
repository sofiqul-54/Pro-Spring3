package com.sofiqul54;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfi.class);
        Student student= (Student) context.getBean("student");
        System.out.println(student);
        Student student1 = (Student) context.getBean("student2");
        System.out.println(student1);
    }
}
