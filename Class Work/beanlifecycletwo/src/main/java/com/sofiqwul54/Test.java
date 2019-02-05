package com.sofiqwul54;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee e = (Employee) context.getBean("emp");
        System.out.println(e);
        //context.close();
    }
}
