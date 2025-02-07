package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.components.Wheel;

@Configuration
@ComponentScan(basePackages = {"com.spring.components"} )
public class AppCongfig {

//	@Bean
//	public Wheel wheel(){
//		
//		return new Wheel();
//	}
}
