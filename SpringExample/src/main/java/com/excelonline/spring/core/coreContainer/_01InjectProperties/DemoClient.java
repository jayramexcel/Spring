package com.excelonline.spring.core.coreContainer._01InjectProperties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class   DemoClient {
	public static void main(String args[]) {
		Resource  res = new ClassPathResource("info/_7chapters/spring/core/coreContainer/_01InjectProperties/applicationContext.xml");
		BeanFactory  factory = new XmlBeanFactory(res);
		
		Company comp = (Company)factory.getBean("company");
		System.out.println("DemoClient.main()" + comp.strength());
		System.out.println(comp.logoName());
	}
}