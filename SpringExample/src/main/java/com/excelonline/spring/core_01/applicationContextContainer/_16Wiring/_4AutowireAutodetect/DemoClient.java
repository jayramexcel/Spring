package com.excelonline.spring.core_01.applicationContextContainer._16Wiring._4AutowireAutodetect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class   DemoClient {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/excelonline/spring/core_01/applicationContextContainer/_16Wiring/_4AutowireAutodetect/applicationContext.xml");
		DemoBean d = (DemoBean) ctx.getBean("db");
		System.out.println(d.hi());
	}
}