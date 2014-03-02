package com.excelonline.spring.core.advancedContainer._17Wiring._4AutowireAutodetect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class   DemoClient {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/excel/core_01/applicationContextContainer/_17Wiring/_4AutowireAutodetect/applicationContext.xml");
		DemoBean d = (DemoBean) ctx.getBean("db");
		System.out.println(d.hi());
	}
}