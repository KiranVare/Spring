package com.spring.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	//tight coupling can occured during the field injection
	
	//-->Field Injection-->it uses reflection api
//	@Autowired
	private Wheel wheel;
	private Engine engine;
	
	//-->constructor injection preferable
	// @autowired is not use anymore in it
//	public Car(Wheel wheel, Engine engine) {
//		super();
//		this.wheel = wheel;
//		this.engine = engine;
//	}
	
	///setter injection
	
	
	
	
	

	public Wheel getWheel() {
		return wheel;
	}

	@Autowired //-->to check only we can use the  sout
	public void setWheel(Wheel wheel) {
		System.out.println("Using setter function");
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	//setter injection is used in the setter only
	@Autowired
	public void setEngine(Engine engine) {
		System.out.println("usig setter engine function");
		this.engine = engine;
	}
	
	public void drive()
	{
		System.out.println("driving car");
		wheel.use();
		engine.use();
	}

	
	
	
	
}
