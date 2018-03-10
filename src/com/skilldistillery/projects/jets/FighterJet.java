package com.skilldistillery.projects.jets;

public class FighterJet extends Jet implements CombatReady {
	protected int fireRate;
	public FighterJet(double speed, String model, int range, long price, int fireRate) {
		super(speed, model, range, price);
		this.fireRate = fireRate;
	}

	@Override
	public void fight() {
		System.out.println(model + ": That's an affirmative control... over*KSHHH* engaging enemy aircraft... over*KSHHH*");
		System.out.println("\tfiring at a rate of " + fireRate + " per minute... out\n");
	}

	@Override
	public void fly() {
		System.out.println(toString());
		System.out.println("This aircraft can travel at top speed for " + (speed / range) + " hours.\n");
	}

	public int getFireRate() {
		return fireRate;
	}

	public void setFireRate(int fireRate) {
		this.fireRate = fireRate;
	}
}
