package com.skilldistillery.projects.jets;

public class JetImpl extends Jet {
	public JetImpl(double speed, String model, int range, long price) {
		super(speed, model, range, price);
	}

	@Override
	public void fly() {
		System.out.println(toString() + "\n");
		System.out.println("This aircraft can travel at top speed for " + (speed/range) + " hours.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("model = ");
		builder.append(model);
		builder.append(", speed = ");
		builder.append(model);
		builder.append(" , range = ");
		builder.append(range);
		builder.append(" , price = ");
		builder.append(price);
		return builder.toString();
	}
	
}
