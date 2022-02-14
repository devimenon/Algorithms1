package com.example.dp.factory;

public class AppFactory {

	Creator creator;
	
	void initialize(String productType) {
		creator = productType.equals("A")?new CreatorAConcrete() : new CreatorBConcrete();
	}
	
	public static void main(String[] args) {
		AppFactory app = new AppFactory();
		app.initialize("A");
		Product p = app.creator.createProduct();
		p.doStuff();
				
	}
}
