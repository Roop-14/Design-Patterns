package com.roop.comp;

public final class BlueDart implements Courier {
	@Override
	public String deliver(int parcelId) {
		
		return parcelId+"Given to BlueDart"
				;
	}

}
