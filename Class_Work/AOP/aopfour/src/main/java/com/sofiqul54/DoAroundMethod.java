package com.sofiqul54;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class DoAroundMethod implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("***SPRING AOP*** DoAroundMethod : Method Name:"+methodInvocation.getMethod().getName());
        System.out.println("***SPRING AOP*** DoAroundMethod : Method Arguments : " + Arrays.toString(methodInvocation.getArguments()));
        System.out.println("***SPRING AOP***DoAroundMethod: Method Executing!!");
        try {
            Object result = methodInvocation.proceed();
            System.out.println("***SPRING AOP***DoAroundMethod: After Method Executing!!");
        return result;
        }catch (IllegalArgumentException e){
            System.out.println("***SPRING AOP***DoAroundMethod: When Method throws Execution!!");
        throw e;
        }
    }
}
