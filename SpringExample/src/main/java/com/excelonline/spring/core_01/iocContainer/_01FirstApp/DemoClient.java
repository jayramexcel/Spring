package com.excelonline.spring.core_01.iocContainer._01FirstApp;


import org.springframework.core.io.Resource;

import org.springframework.core.io.ClassPathResource;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class   DemoClient
{
	public static void main(String args[])
	{
		//location of spring confiuration file
		Resource  res=new ClassPathResource("/com/excel/core_01/iocContainer/_01FirstApp/spring.cfg.xml");

		//activation of  spring container & reading spring configuration file
		BeanFactory  factory=new XmlBeanFactory(res);

		//getting object of implementation class
		//DemoInter d = (DemoInter)factory.getBean("com.excelonline.spring.core_01.iocContainer._01FirstApp.DemoInterImpl");
		DemoInterImpl d = (DemoInterImpl)factory.getBean("com.excelonline.spring.core_01.iocContainer._01FirstApp.DemoInterImpl");
//		d.setMessage("Hi");
		/**
		DemoInterImpl d1 =  (DemoInterImpl) factory.getBean("p1.DemoInterImpl");
		DemoInterImpl d2=(DemoInterImpl)factory.getBean("p1.DemoInterImpl");
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		 */
		System.out.println(d.wish("Rahul"));
	}
}