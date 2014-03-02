package com.excelonline.spring.core.coreContainer._08ConstructorInjection;

import org.springframework.core.io.Resource;

import org.springframework.core.io.ClassPathResource;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

public class   DemoClient
{
	public static void main(String args[])
	{
		Resource  res=new ClassPathResource("com/excel/core_01/iocContainer/_08ConstructorInjection/applicationContext.xml");
		BeanFactory  factory=new XmlBeanFactory(res);
		Demo d1=(Demo)factory.getBean("demo");
		System.out.print(d1);

	}
}
