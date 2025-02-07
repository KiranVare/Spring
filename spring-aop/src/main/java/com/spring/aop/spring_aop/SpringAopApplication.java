package com.spring.aop.spring_aop;

import com.spring.aop.spring_aop.Services.LoginService;
import com.spring.aop.spring_aop.Services.ProductService;
import com.spring.aop.spring_aop.Services.UserServices;
import com.spring.aop.spring_aop.beans.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args)
	{

		ConfigurableApplicationContext context = SpringApplication.run(SpringAopApplication.class, args);

//		//Employee employee = context.getBean(Employee.class);
//		//employee.work();

//		LoginService log = context.getBean(LoginService.class);
//		ProductService ps = context.getBean(ProductService.class);
//		UserServices us = context.getBean(UserServices.class);

//		log.mainLogin();
//		ps.printProducts();
//		us.userServices();

		LoginService ls =context.getBean(LoginService.class);
		ls.userLogin("system","admin123");
	}

}
