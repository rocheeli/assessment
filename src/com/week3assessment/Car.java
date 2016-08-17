package com.week3assessment;

public class Car extends Vehicle
{
	private boolean hatchback = false;
	
	

	public Car(int windows, int doors, boolean runs, String model, String color, boolean fueledUp, 
			boolean hatchback)
	{
		super(windows, doors, runs, model, color, fueledUp);
		this.hatchback = hatchback;
	}
	
	
}
