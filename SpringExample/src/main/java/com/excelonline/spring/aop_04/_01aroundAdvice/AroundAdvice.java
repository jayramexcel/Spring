package com.excelonline.spring.aop_04._01aroundAdvice;

import org.aopalliance.intercept.MethodInvocation;
import org.aopalliance.intercept.MethodInterceptor;

public class AroundAdvice implements MethodInterceptor
{
	public Object invoke (MethodInvocation i1) throws Throwable
	{
		System.out.println("Hi.....");   
		i1.proceed();   //calls business logic method  
		System.out.println("Goodbye! ");     
		return null;
	}
}
