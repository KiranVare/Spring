package com.spring.aop.spring_aop.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AllClassAspect {

    @Before("execution(* com.spring.aop.spring_aop.Services.*.*())")
    public void mainAspect()
    {
        System.out.println();
        System.out.println("Executing main aspect ....");
    }

}
