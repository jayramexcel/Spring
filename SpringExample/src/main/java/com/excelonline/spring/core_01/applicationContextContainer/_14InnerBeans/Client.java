package com.excelonline.spring.core_01.applicationContextContainer._14InnerBeans;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("com/excel/core_01/applicationContextContainer/_14InnerBeans/applicationContext.xml");
		
		Second s = (Second) ctx.getBean("two");
		
		System.out.println(s);

	}

}
