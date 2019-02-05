package com.sofiqul54;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TextEditor textEditor = (TextEditor) context.getBean("te");
        textEditor.checkSpelling();

    }
}
