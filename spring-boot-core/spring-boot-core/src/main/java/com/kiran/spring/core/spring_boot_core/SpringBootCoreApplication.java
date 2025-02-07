package com.kiran.spring.core.spring_boot_core;

import com.kiran.spring.core.spring_boot_core.Controller.HomeController;
import com.kiran.spring.core.spring_boot_core.comp.Father;
import com.kiran.spring.core.spring_boot_core.comp.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import substring.Car;

@SpringBootApplication
@ComponentScan(basePackages = {"substring","com.kiran.spring.core.spring_boot_core"})
public class SpringBootCoreApplication {

	public static void main(String[] args) throws InterruptedException {
		//bootstrapping the application
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootCoreApplication.class, args);
//		Student student= applicationContext.getBean(Student.class);
//		System.out.println(student);
//		student.study();
//		Car car = applicationContext.getBean(Car.class);
//		System.out.println(car);

//		Father father = applicationContext.getBean(Father.class);
		//name of the bean is always in the camelCase of the Class Name;

//		Father father = applicationContext.getBean("father", Father.class);
//		father.useStudent();
//
//		HomeController controller = applicationContext.getBean(HomeController.class);
//		controller.loginUser();
//		controller.logoutUser();

		Car car1 = applicationContext.getBean(Car.class);
		Car car2 = applicationContext.getBean(Car.class);

		System.out.println(car1);
		System.out.println(car2);

	}

}
