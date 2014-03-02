package com.excelonline.spring.core.coreContainer._00Demo;

public class BikeCompany implements Company {

	@Override
	public int strength() {
		return 100;
	}

	@Override
	public String logoName() {
		return "We are BikeCompany";
	}

}