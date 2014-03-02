package com.excelonline.spring.core.coreContainer._11StaticFactory;

import java.util.Calendar;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class DemoClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource(
				"com/excel/core_01/iocContainer/_11StaticFactory/applicationContext.xml");

		XmlBeanFactory factory = new XmlBeanFactory(res);

		DemoBean d1 = (DemoBean) factory.getBean("db");

		Calendar cal = Calendar.getInstance();
		
		System.out.print(d1.sayHello());
	}
}