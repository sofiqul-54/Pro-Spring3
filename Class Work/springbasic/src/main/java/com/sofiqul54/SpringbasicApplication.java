package com.sofiqul54;

import com.sofiqul54.autowire.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbasicApplication {



    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbasicApplication.class, args);
        Employee employee = (Employee) context.getBean(Employee.class);
        employee.showDetails();
    }

}

