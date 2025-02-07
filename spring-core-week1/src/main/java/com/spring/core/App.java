package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.components.Car;
import com.spring.components.Wheel;
import com.spring.config.AppCongfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	
 //			project id --> package name
 //			artifact id--> project name
    	
    	
    	
//    	Wheel wheel = new Wheel();
//    	Car car = new Car();
//    	car.drive(wheel);
    	
    	//to access the objects from spring container
    	//we need some kind of the interface
    	//application context is  interface to access the container
    	//BeanFactory --> is deprecated from Spring 3
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/config.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppCongfig.class);
//    	Wheel wheel = context.getBean(Wheel.class);
//    	wheel.use();
//    	System.out.println(wheel);
    	Car car = context.getBean(Car.class);
    	car.drive();
    	System.out.println(car);
    	
    }
}
