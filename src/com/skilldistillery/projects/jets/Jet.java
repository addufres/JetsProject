package com.skilldistillery.projects.jets;

public abstract class Jet {
	protected double speed;
	protected String model;
	protected int range;
	protected long price;

	public abstract void fly(); // prints out the Jet details and the amount of time 
							   // the Jet can fly until it runs out of fuel
							   // (based on speed and range).

	public Jet(double speed, String model, int range, long price) {
		super();
		this.speed = speed;
		this.model = model;
		this.range = range;
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [speed=");
		builder.append(speed);
		builder.append(", model=");
		builder.append(model);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + range;
		long temp;
		temp = Double.doubleToLongBits(speed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (range != other.range)
			return false;
		if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
			return false;
		return true;
	}

	public double getSpeedInMach() {
		return speed * 0.0013;
	}
}
