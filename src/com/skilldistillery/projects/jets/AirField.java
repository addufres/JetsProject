package com.skilldistillery.projects.jets;

public class AirField {
	protected Jet[] jets;
	protected int currentJetIndex;

	public AirField(Jet[] jets) {
		super();
		this.jets = jets;
	}
	
	public void addJet(Jet jet) {
		jets[currentJetIndex] = jet;
		currentJetIndex++;
	}
}
