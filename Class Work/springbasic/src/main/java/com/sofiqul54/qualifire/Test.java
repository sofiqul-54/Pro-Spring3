package com.sofiqul54.qualifire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sofiqul54.qualifire");
        context.refresh();
        VechileService vechileService =context.getBean(VechileService.class);
        vechileService.service();
        context.close();
    }

}
