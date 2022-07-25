package com.interfaces;

public interface Vehicle {

	void horn();
	default void speedMeter() {
		System.out.println("SpeedMeter");
	}

}
