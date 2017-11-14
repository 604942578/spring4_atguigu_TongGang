package com.atguigu.spring.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("beforeMethod The method '" + methodName + "()' begins with " + Arrays.asList(args));
    }

    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("afterMethod The method '" + methodName + "()' ends");
    }

    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("afterReturning The method '" + methodName + "()' ends with " + result);
    }

    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("afterThrowing The method '" + methodName + "()' occurs exception: " + e);
    }

    public Object aroundMethod(ProceedingJoinPoint pjd) {
        Object result = null;
        String methodName = pjd.getSignature().getName();

        try {
            //ǰ��֪ͨ
            System.out.println(
                    "aroundMethod The method '" + methodName + "()' begins with " + Arrays.asList(pjd.getArgs()));
            //ִ��Ŀ�귽��
            result = pjd.proceed();
            //����֪ͨ
            System.out.println("aroundMethod The method '" + methodName + "()' ends with " + result);
        } catch (Throwable e) {
            //�쳣֪ͨ
            System.out.println("aroundMethod The method '" + methodName + "()' occurs exception:" + e);
            throw new RuntimeException(e);
        }
        //����֪ͨ
        System.out.println("aroundMethod The method '" + methodName + "()' ends");

        return result;
    }
}
