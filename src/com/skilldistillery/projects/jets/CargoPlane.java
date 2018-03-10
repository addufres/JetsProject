package com.skilldistillery.projects.jets;

public class CargoPlane extends Jet implements CargoCarrier {
	protected int maxLoad;

	public CargoPlane(double speed, String model, int range, long price, int maxLoad) {
		super(speed, model, range, price);
		this.maxLoad = maxLoad;
	}

	@Override
	public void fly() {
		System.out.println(toString() + "\n");
		System.out.println("This aircraft can travel at top speed for " + (speed / range) + " hours.");

	}

	@Override
	public void loadCargo() {
		System.out.println(model + " now initiating cargo load to max load capacity of " + maxLoad + " pounds.");
	}

}
