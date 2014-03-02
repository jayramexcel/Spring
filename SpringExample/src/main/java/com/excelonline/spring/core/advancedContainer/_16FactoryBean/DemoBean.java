package com.excelonline.spring.core.advancedContainer._16FactoryBean;
import java.util.Calendar;
import java.util.Date;


public class DemoBean implements Demo{
	
	private Date dt;
	
	private Calendar cl;
	
	public void setDt(Date dt)
	{
		this.dt = dt;
	}
	
	public void setCl(Calendar cl)
	{
		this.cl = cl;
	}
	
	public String hi()
	{
		return "date: "+dt+"   cl = "+cl;
	}

}
