package info._7chapters.spring.core;

import info._7chapters.spring.aop.customer.Customer;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author Jayram
 *
 */
@ContextConfiguration(locations={"Spring-Customer.xml"})
public class AppTest {
	ApplicationContext context;

	@Before
	public void setup(){
		context = new ClassPathXmlApplicationContext("Spring-Customer.xml");
	}
	@Test
	public void testCustomer() throws Exception {
		Customer customer = (Customer) context.getBean("customerBo");
//		customer.addCustomer();
		customer.addCustomerReturnValue();
		//customer.addCustomerThrowException();
		//customer.addCustomerAround("jayram");
	}
}