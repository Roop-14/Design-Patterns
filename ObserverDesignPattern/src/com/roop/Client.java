package com.roop;

public class Client {
	public static void main(String[] args) {
		Observer observer1=new Observer();
		Observer observer2=new Observer();
		
		Subject subject=new  Subject();
		subject.add(observer1);
		subject.add(observer2);
		
		subject.setPrice(95600.25);
		
		subject.remove(observer2);
		
		subject.setPrice(69024.250);
		
	}

}
