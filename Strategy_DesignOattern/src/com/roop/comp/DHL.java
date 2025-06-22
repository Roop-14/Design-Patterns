package com.roop.comp;

public final class DHL implements Courier {
	
	@Override
public String deliver(int parcelId) {
	
	return parcelId+"   Given for delivery to Blue DHL Service";
}
}
