package com.excelonline.spring.core.advancedContainer._17Wiring._1AutowireByName;
public class DemoBean implements Demo{
	TestBean tb = null;
	public DemoBean() {
		System.out.println("Zero arg constructor of DemoBean class");
	}
	public DemoBean(TestBean tb) {
		System.out.println("One arg constructor of DemoBean class");
		this.tb = tb;
	}
	public void setTb(TestBean tb) {
		System.out.println("setTb() of DemoBean class");		
		this.tb = tb;
	}
	public String hi() {
		return tb.toString();
	}
}