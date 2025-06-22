package com.roop.factory;

import com.roop.comp.BlueDart;
import com.roop.comp.Courier;
import com.roop.comp.DHL;
import com.roop.comp.Delhieveery;
import com.roop.comp.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart getFactory(String courierServiceProvider) {
		
		Courier courier=null;
		if(courierServiceProvider.equalsIgnoreCase("DHL")) {
			courier=new DHL();
		}else if(courierServiceProvider.equalsIgnoreCase("BlueDart")) {
			courier=new BlueDart();
		}else if(courierServiceProvider.equalsIgnoreCase("Delhieveery")) {
			courier=new Delhieveery();
		}
		else {
			throw new IllegalArgumentException("Invalid courier type");
		}
		
		Flipkart flipkart=new Flipkart(courier);
		
		return flipkart;
	}

}
