package com.interfaces;

public class Main {
	
	public static void main(String[] args) {
		
	Vehicle vehicle = new Car();
	vehicle.horn();
	//Vehicle.speedMeter();//static
	vehicle.speedMeter();
	
	vehicle = new Bike();
	vehicle.horn();
	//Vehicle.speedMeter();//static
	vehicle.speedMeter();
	}
}
	
