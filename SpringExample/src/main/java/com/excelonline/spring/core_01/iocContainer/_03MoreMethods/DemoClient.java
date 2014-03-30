package com.excelonline.spring.core_01.iocContainer._03MoreMethods;

import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
public class DemoClient
{
	public static void main(String args[])
	{
		Resource  res=new ClassPathResource("com/excelonline/spring/core_01/iocContainer/_03MoreMethods/Demo.xml");
		BeanFactory  factory=new XmlBeanFactory(res);

		DemoInter d1=(DemoInter)factory.getBean("demo");
		//DemoInterImpl d1=(DemoInterImpl)factory.getBean("demo");
		System.out.println(d1.wish("friends"));
		System.out.println("Short format Date is: "+new java.util.Date());
		System.out.println("Full formt date is: "+d1.getDateTime());
	}
}