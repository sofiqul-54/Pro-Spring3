package com.sofiqul54.autowire;


import com.sofiqul54.SpringbasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestConfig {
   /* public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestConfig.class,args);
        Employee employee = context.getBean(Employee.class);
        employee.showDetails();
    }*/

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TestConfig.class, args);
        Employee employee = (Employee) context.getBean(Employee.class);
        employee.showDetails();
    }
}
