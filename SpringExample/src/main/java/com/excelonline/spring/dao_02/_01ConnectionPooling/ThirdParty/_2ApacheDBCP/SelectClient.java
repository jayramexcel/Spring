package com.excelonline.spring.dao_02._01ConnectionPooling.ThirdParty._2ApacheDBCP;

import org.springframework.core.io.FileSystemResource;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class   SelectClient {
        public static void main(String args[]) {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/excel/dao_02/_01ConnectionPooling/ThirdParty/_2ApacheDBCP/spring.cfg.xml");
			SelectImple s=(SelectImple)ctx.getBean("sel");
			System.out.println("Employee name is: "+s.fetchEmpName(7839));
			System.out.println("Employee salary is: "+s.fetchEmpSalary(7839));
        }
}