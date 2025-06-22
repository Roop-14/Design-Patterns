package com.roop;

import java.util.ArrayList;

import java.util.List;

public class Subject {
	
	Double gold_price=85214.02;
	List<Observer> observers=new ArrayList<>();
	
	public void setPrice(Double price) {
		this.gold_price=price;
		notifyAllObservers();
	}
	
	private void notifyAllObservers() {
		 for(Observer observer:observers) {
			 //send notification
			 observer.update(gold_price);
			 
		 }
		
	}
//register observers
	public void add(Observer observer) {
		observers.add(observer);
	}

	public void remove(Observer observer) {
		observers.remove(observer);
		
	}

}
