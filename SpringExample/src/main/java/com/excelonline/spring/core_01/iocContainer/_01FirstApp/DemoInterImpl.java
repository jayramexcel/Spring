package com.excelonline.spring.core_01.iocContainer._01FirstApp;


public class  DemoInterImpl  implements DemoInter
{
	private String  message;

	public DemoInterImpl()
	{
		System.out.println("Constructor executed");
	}

	public void setMessage(String message)
	{
		System.out.println("setter method executed");
		this.message=message;
	}

	public String wish(String uname)
	{
		return   message+" "+uname+" Have a great day";
	}
}