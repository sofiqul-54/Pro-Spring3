package com.sofiqul54;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class doBeforeMethod implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("**********SPRING AOP******doBeforeMethod: Executing before method");
    }
}
