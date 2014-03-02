package com.excelonline.spring.core_01.applicationContextContainer._06MultipleCfgFiles;
public class DemoBean {
	
	TestBean tb = null;

	public void setTb(TestBean tb) {
		this.tb = tb;
	}
	
	public String toString()
	{
		return tb.msg;
		
	}

}
