package com.skilldistillery.projects.jets;

public class FighterJet extends Jet implements CombatReady {
	protected int fireRate;
	public FighterJet(double speed, String model, int range, long price, int fireRate) {
		super(speed, model, range, price);
		this.fireRate = fireRate;
	}

	@Override
	public void fight() {
		System.out.println(model + ": That's an affirmative control *KSHHH* engaging enemy aircraft *KSHHH*");
		System.out.println(model + "firing at a rate of " + fireRate + " per minute.");
	}

	@Override
	public void fly() {
		System.out.println(toString() + "\n");
		System.out.println("This aircraft can travel at top speed for " + (speed / range) + " hours.");
	}

}
