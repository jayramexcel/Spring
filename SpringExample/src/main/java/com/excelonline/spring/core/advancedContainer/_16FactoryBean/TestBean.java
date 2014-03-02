package com.excelonline.spring.core.advancedContainer._16FactoryBean;
import java.util.Calendar;
import org.springframework.beans.factory.FactoryBean; 

public class TestBean implements FactoryBean{


	public Object getObject() throws Exception {
		System.out.println("getObject()");
		Calendar cl = Calendar.getInstance();
		return cl;
	}

	public Class getObjectType() {		
		System.out.println("getObjectType()");
		Class c =  Calendar.class;
		return c;
	}

	public boolean isSingleton() {
		System.out.println("isSingleton()");
		return true;
	}
	
	
	
	
	
	
	
		
}
