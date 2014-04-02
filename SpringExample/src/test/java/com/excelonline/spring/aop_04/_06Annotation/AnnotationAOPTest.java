package com.excelonline.spring.aop_04._06Annotation;

import com.excelonline.spring.aop_04._06Annotation.customer.Customer;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author Jayram Rout
 *
 */
@ContextConfiguration(locations={"Spring-AOP-Annotation-Customer.xml"})
public class AnnotationAOPTest {
	ApplicationContext context;

	@Before
	public void setup(){
		context = new ClassPathXmlApplicationContext("Spring-AOP-Annotation-Customer.xml");
	}
	@Test
	public void testCustomer() throws Exception {
		Customer customer = (Customer) context.getBean("customerBo");
		customer.addCustomer();
//		customer.addCustomerReturnValue();
		//customer.addCustomerThrowException();
		//customer.addCustomerAround("jayram");
	}
}