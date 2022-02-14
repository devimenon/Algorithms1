package com.example.dp.factory;

public interface Product {

	void doStuff();
}

class ProductA implements Product{

	@Override
	public void doStuff() {
		System.out.println("Do product A stuff");
		
	}

}

class ProductB implements Product {

	@Override
	public void doStuff() {
		System.out.println("Do product B stuff");
	}
	
}

