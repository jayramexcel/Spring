package com.excelonline.spring.core_01.iocContainer._00Demo;

public class CarCompany implements Company {

	@Override
	public int strength() {
		return 200;
	}

	@Override
	public String logoName() {
		return "We are CarCompany";
	}

}
