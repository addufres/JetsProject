package com.skilldistillery.projects.jets;

public class CargoPlane extends Jet implements CargoCarrier {
	protected int maxLoad;

	public CargoPlane(double speed, String model, int range, long price, int maxLoad) {
		super(speed, model, range, price);
		this.maxLoad = maxLoad;
	}

	@Override
	public void fly() {
		System.out.println(toString());
		System.out.println("This aircraft can travel at top speed for " + (speed / range) + " hours.\n");

	}

	@Override
	public void loadCargo() {
		System.out.println(model + " now initiating cargo load to max load capacity of " + maxLoad + " pounds.\n");
	}

	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}
	

}
