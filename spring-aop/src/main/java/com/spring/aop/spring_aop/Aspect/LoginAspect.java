package com.spring.aop.spring_aop.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;

@Component
@Aspect
public class LoginAspect {


    @Around("execution(* com.spring.aop.spring_aop.Services.LoginService.userLogin(String,String))")
    public void validateUser(ProceedingJoinPoint joinPoint) throws Throwable {
        String username = joinPoint.getArgs()[0].toString();
        String password = joinPoint.getArgs()[1].toString();

        if(username.equals("admin") && password.equals("admin123"))
        {
            joinPoint.proceed();
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("User Login fail....");
            throw new RuntimeException("Invalid username or password");
        }

    }

}
