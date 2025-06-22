package com.roop;

interface Coffee {
	String getDescription();

	double cost();
}

class BasicCoffee implements Coffee {
	@Override
	public String getDescription() {

		return "Basic Coffee";
	}

	@Override
	public double cost() {

		return 25.25;
	}
}

abstract class CoffeDecorator implements Coffee {
	protected Coffee coffee;

	public CoffeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
}

class MilkDecorator extends CoffeDecorator {
	public MilkDecorator(Coffee coffee) {
		super(coffee);

	}

	@Override
	public String getDescription() {

		return coffee.getDescription() + "add Milk";
	}

	@Override
	public double cost() {

		return coffee.cost() + 10.25;
	}
}

class HoneyDecorator extends CoffeDecorator {
	public HoneyDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public double cost() {

		return coffee.cost() + 15.99;

	}

	@Override
	public String getDescription() {

		return coffee.getDescription() + " addHoney";
	}
}

public class MainPattern {

	public static void main(String[] args) {
		Coffee coffee=new HoneyDecorator(new MilkDecorator(new BasicCoffee()));
		System.out.println(coffee.getDescription());
		System.out.println(coffee.cost());
		

	}

}
