package com.excelonline.spring.annotation.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class VehicleClient {
//	Vehicle v = (Vehicle)ctx.getBean("vehicle");
	public static void main(String arg[]){
		String appXML = "com/excelonline/spring/annotation/vehicle/applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(appXML);
	}
}