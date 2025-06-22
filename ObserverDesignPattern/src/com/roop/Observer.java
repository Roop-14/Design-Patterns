package com.roop;

public class Observer {
	
	Double gold_price;
	
	public void update(Double price) {
		this.gold_price=price;
		displayGoldPrice();
	}

	private void displayGoldPrice() {
		System.out.println("Price for the gold is:" +this.gold_price);
		
	}

}
