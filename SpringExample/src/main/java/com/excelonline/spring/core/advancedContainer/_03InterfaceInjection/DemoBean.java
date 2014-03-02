package com.excelonline.spring.core.advancedContainer._03InterfaceInjection;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class DemoBean implements Demo, BeanNameAware, ApplicationContextAware{

	String msg, bname;
	
	ApplicationContext ctx = null;	

	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		this.ctx = ctx;
	}
	@Override
	public void setBeanName(String bname) {
		this.bname = bname;
	}
	public String hi() {
		System.out.println("Logical current bean name is: "+bname);
		System.out.println("No. of beans managed by underlying container are: "+ctx.getBeanDefinitionCount());
		System.out.println("Current bean is singleton: "+ctx.isSingleton(bname));
		System.out.println("Current bean is proptotype bean: "+ctx.isPrototype(bname));
		return msg;
	}



	

}
