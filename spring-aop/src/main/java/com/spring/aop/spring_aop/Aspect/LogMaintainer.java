package com.spring.aop.spring_aop.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogMaintainer {

    @Before("execution(* com.spring.aop.spring_aop.Services.LoginService.*())")
    public void maintainLog()
    {
        System.out.println("Maintain log Executed : Before");
    }

    @After("execution(* com.spring.aop.spring_aop.Services.LoginService.*())")
    public void maintainLogAfter()
    {
        System.out.println("Maintain log Executed : After");
    }

}
