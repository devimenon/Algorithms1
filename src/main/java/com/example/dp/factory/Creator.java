package com.example.dp.factory;

abstract class Creator {
	
	void someOperation() {
		System.out.println("Some operation of Creator");
	}
	
	abstract Product createProduct();
	
}

class CreatorAConcrete extends Creator {

	@Override
	Product createProduct() {
		return new ProductA();
	}
	
}

class CreatorBConcrete extends Creator {

	@Override
	Product createProduct() {
		return new ProductB();
	}
	
}

