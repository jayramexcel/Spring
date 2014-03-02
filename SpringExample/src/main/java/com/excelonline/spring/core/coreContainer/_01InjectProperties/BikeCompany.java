package com.excelonline.spring.core.coreContainer._01InjectProperties;

public class BikeCompany implements Company {
	private String tyreType;

	public String getTyreType() {
		return tyreType;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}

	@Override
	public int strength() {
		return 100;
	}

	@Override
	public String logoName() {
		return "We are BikeCompany using "+ tyreType;
	}

}