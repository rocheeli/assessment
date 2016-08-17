package com.week3assessment;

public class Vehicle
{
	
public static void main(String[] args)
{
	
	private int windows = 0;
	private int doors = 0;
	private boolean runs = false;
	private String model = null;
	private String color = null;
	protected boolean fueledUp = false;
	
	
	
	public Vehicle(int windows, int doors, boolean runs, String model, String color, boolean fueledUp)
	{
		this.windows = windows;
		this.doors = doors;
		this.runs = runs;
		this.model = model;
		this.color = color;
		this.fueledUp = fueledUp;
	}

	
	
	public int getWindows()
	{
		return windows;
	}



	public void setWindows(int windows)
	{
		this.windows = windows;
	}



	public int getDoors()
	{
		return doors;
	}



	public void setDoors(int doors)
	{
		this.doors = doors;
	}



	public boolean isRuns()
	{
		return runs;
	}



	public void setRuns(boolean runs)
	{
		this.runs = runs;
	}



	public String getModel()
	{
		return model;
	}



	public void setModel(String model)
	{
		this.model = model;
	}



	public String getColor()
	{
		return color;
	}



	public void setColor(String color)
	{
		this.color = color;
	}



	public boolean isFueledUp()
	{
		return fueledUp;
	}



	public void setFueledUp(boolean fueledUp)
	{
		this.fueledUp = fueledUp;
		{

		
	
	
}
	}
}


