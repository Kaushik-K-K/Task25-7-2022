package com.interfaces;

public class Bike implements Vehicle {

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		System.out.println("Bike honking..");		
	}
	
	@Override
	public void speedMeter() {
		System.out.println("Bike Overriden SpeedMeter method");
	}

}
