package com.capgemini.JunitAssignment;

public class Car {
	private Engine engine;
	private FuelTank fuelTank;
	public Car(Engine engine, FuelTank fuelTank) {
		super();
		this.engine = engine;
		this.fuelTank = fuelTank;
	}
	
public void start()
{
	if(engine.isRunning())
	{
		throw new IllegalStateException("Engine already running");
	}
	if(fuelTank.getFuel()==0)
	{
		throw new IllegalStateException("There is no fuel in your car");
	}
	engine.start();
	if(!engine.isRunning())
	{
		throw new IllegalStateException("Started engine but isn't running");
	}
}
public boolean isRunning()
{
	return engine.isRunning();
}
}
