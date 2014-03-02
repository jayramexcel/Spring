package com.excelonline.spring.core_01.applicationContextContainer._16FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class   DemoClient
{
        public static void main(String args[])
        {

        	ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/excel/core_01/applicationContextContainer/_16FactoryBean/applicationContext.xml");
	
        	DemoBean d = (DemoBean) ctx.getBean("db");
	
        	System.out.println(d.hi());
        }
}