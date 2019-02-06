package com.sofiqul54.scope;

import com.sofiqul54.autowire.Employee;
import com.sofiqul54.autowire.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Test.class);
        com.sofiqul54.scope.Asingleton asingleton = context.getBean(com.sofiqul54.scope.Asingleton.class);
        com.sofiqul54.scope.Asingleton asingleton1 = context.getBean(com.sofiqul54.scope.Asingleton.class);

       /* ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        Asingleton asingleton = (Asingleton) context.getBean(Asingleton.class);*/

        com.sofiqul54.scope.Bprototype bprototype = context.getBean(com.sofiqul54.scope.Bprototype.class);
        com.sofiqul54.scope.Asingleton bprototype1 = context.getBean(com.sofiqul54.scope.Asingleton.class);


    }
}
