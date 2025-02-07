package com.spring.aop.spring_aop.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Component
public class Employee
        //implements InitializingBean, DisposableBean --> this is using interface
{

    public Employee() {
        System.out.println("Employee Created");
    }

//    @Override
    @PreDestroy //--> this is using annotation for destroying bean or cleaning beans properties
    public void destroy() throws Exception {
        System.out.println("Employee Destroyed");
    }

//    @Override
    @PostConstruct //-->this is using annotation for initializing bean properties after creating it
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Employee");
        System.out.println("property set");
    }

    public void work()
    {
        System.out.println("Employee working");
    }

}
