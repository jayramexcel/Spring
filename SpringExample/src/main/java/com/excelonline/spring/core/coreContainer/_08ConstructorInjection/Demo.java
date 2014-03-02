package com.excelonline.spring.core.coreContainer._08ConstructorInjection;
public class  Demo {	
	private String  message;

	public Demo() {
		System.out.println("Zero arg constructor");
	}

	public Demo(String message)	{
		this.message = message;
		System.out.println("One arg constructor");
	}

	public String toString() {
		return message;
	}
}