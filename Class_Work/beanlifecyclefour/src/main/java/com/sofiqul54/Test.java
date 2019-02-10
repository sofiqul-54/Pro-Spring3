package com.sofiqul54;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("aspplicationContext.xml");
        Employee employee = (Employee) context.getBean("a1");
        System.out.println(employee);
        context.close();
    }
}
