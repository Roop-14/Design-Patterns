package com.roop.comp;

import java.util.Arrays;
import java.util.Random;
//Target claass

//use composition
//code to inteface or abstract class
//close to modification open for extension
final public class Flipkart {
	// HAS-A
	private Courier courier;

	public Flipkart(Courier courier) {
		this.courier = courier;

	}

	public String shopping(String[] items, double[] prices) {
		double billAmt = 0.0;
		for (double priice : prices) {
			billAmt = priice + billAmt;
		}

		int oid = new Random().nextInt(10000);
		String deliveryMsg=courier.deliver(oid);

		return Arrays.toString(items)+"Bill Amount: "+billAmt+"............"+deliveryMsg;
				

	}
	
	

}
