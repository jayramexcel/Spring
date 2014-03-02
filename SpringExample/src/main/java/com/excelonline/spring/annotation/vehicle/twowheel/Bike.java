package com.excelonline.spring.annotation.vehicle.twowheel;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	public Bike(){
		System.out.println("Bike.enclosing_method() "+ this);
	}
}
