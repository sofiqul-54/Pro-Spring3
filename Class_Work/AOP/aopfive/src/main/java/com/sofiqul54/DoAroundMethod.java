package com.sofiqul54;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DoAroundMethod implements MethodInterceptor {
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out
				.println("****SPRING AOP**** DoAroundMethod: Method name : " + methodInvocation.getMethod().getName());
		System.out.println("****SPRING AOP**** DoAroundMethod: Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));

		System.out.println("****SPRING AOP**** DoAroundMethod: Before method executing!");

		try {

			Object result = methodInvocation.proceed();

			System.out.println("****SPRING AOP**** DoAroundMethod: After method executing!");
			return result;

		} catch (IllegalArgumentException e) {

			System.out.println("****SPRING AOP**** DoAroundMethod: When method throws Exception!");
			throw e;
		}
	}

}
