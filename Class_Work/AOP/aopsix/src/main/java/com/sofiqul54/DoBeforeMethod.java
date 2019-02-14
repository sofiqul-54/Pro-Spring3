package com.sofiqul54;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class DoBeforeMethod implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("****SPRING AOP**** DoBeforeMethod : Executing before method!");
	}
}
