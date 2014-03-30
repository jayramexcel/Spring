package com.excelonline.spring.core_01.iocContainer._00Demo;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class   DemoClient
{
	
	public static void main(String args[])
	{
//		Company comp = new BikeCompany();
//		System.out.println("DemoClient.main()" + comp.strength());
//		System.out.println(comp.logoName());
		
		Resource  res = new ClassPathResource("com/excelonline/spring/core_01/iocContainer/_00Demo/applicationContext.xml");
		BeanFactory  factory = new XmlBeanFactory(res);
		
//		Company comp = (Company)factory.getBean("company");
		/*System.out.println("DemoClient.main()" + comp.strength());
		System.out.println(comp.logoName());*/

		//		DemoInterImpl d1 =(DemoInterImpl)  factory.getBean("demo");
////		
//		System.out.println(d1.wish("friends"));
//		d1.hi();
//
//		DemoInter d2 =(DemoInter)factory.getBean("demo");
//		System.out.println(d2.wish("Friends"));
////		d2.hi(); // This is not possible on interface reference
//
//		DemoInterImpl d3 = (DemoInterImpl)factory.getBean("demo");
//
//		System.out.println(d1.hashCode());
//		System.out.println(d2.hashCode());
//		System.out.println(d3.hashCode());
	}
}