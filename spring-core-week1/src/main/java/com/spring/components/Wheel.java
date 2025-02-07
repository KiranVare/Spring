package com.spring.components;

import org.springframework.stereotype.Component;

@Component //--> it makes the class as the bean 
public class Wheel {

	public void use()
	{
		System.out.println("Using wheel");
	}
}
