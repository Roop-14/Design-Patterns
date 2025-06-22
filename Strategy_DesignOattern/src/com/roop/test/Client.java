package com.roop.test;

import com.roop.comp.Flipkart;
import com.roop.factory.FlipkartFactory;

public class Client {
	public static void main(String[] args) {
		Flipkart flipkart=FlipkartFactory.getFactory("DHL");
		String[]items=new String[] {"tv","dishwasher","rosserie machine"};
		double[] prices = {14960.00,54000.0,56000.14};
		System.out.println(flipkart.shopping(items, prices));
	}

}
