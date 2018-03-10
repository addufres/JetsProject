package com.skilldistillery.projects.jets;

import java.util.Scanner;

public class JetApplication {
	public static Scanner input;
	private static AirField airField;
	private static Jet[] jets = new Jet[8];
	protected static int currentLength = 5;

	public JetApplication() {
	}

	public static void main(String[] args) {
		launch();
	}

	private static void viewFastestJet() {
		double mach = jets[0].getSpeedInMach();
		Jet fastest = jets[0];
		for (int i = 1; i < airField.currentJetIndex; i++) {
			if (fastest.getSpeed() < jets[i].getSpeed()) {
				fastest = jets[i];
				mach = jets[i].getSpeedInMach();
			}
		}
		System.out.println(fastest.toString());
		System.out.println(mach + " is this planes speed in MACH.");
	}

	private static void viewLongestRange() {
		Jet longest = jets[0];
		for (int i = 1; i < airField.currentJetIndex; i++) {
			if (longest.getRange() < jets[i].getRange()) {
				longest = jets[i];
			}
		}
		System.out.println(longest.toString());
	}

	private static void loadAllCargo() {
		for (int i = 0; i < airField.currentJetIndex; i++) {
			if (jets[i] instanceof CargoCarrier) {
				((CargoPlane) jets[i]).loadCargo();
			}
		}
	}

	private static void dogfight() {
		for (int i = 0; i < airField.currentJetIndex; i++) {
			if (jets[i] instanceof CombatReady) {
				((FighterJet) jets[i]).fight();
			}
		}
	}

	private static Jet getNewJet() {
		System.out.println("Choose a type of plane:\n1. Cargo Plane\n2. Fighter Jet\n 3. Undefined Plane");
		int type = input.nextInt();
		switch (type) {
		case 1:
			Jet newJet = promptForCargoPlane();
			System.out.println();
			return newJet;
		case 2:
			newJet = promptForFighterJet();
			System.out.println();
			return newJet;
		case 3:
			newJet = promptForJet();
			System.out.println();
			return newJet;
		default:
			return jets[0];
		}

	}

	private static Jet promptForCargoPlane() {
		Jet jet;
		int range, maxLoad;
		double speed, price;
		String model;
		System.out.println("Please enter a model: ");
		model = input.next();
		System.out.println("Please enter a range: ");
		range = input.nextInt();
		System.out.println("Please enter a max speed: ");
		speed = input.nextDouble();
		System.out.println("Please enter a max load: ");
		maxLoad = input.nextInt();
		System.out.println("Please enter a price: ");
		price = input.nextDouble();
		jet = new CargoPlane(speed, model, range, (long) price, maxLoad);
		return jet;
	}

	private static Jet promptForFighterJet() {
		Jet jet;
		int range, fireRate;
		double speed, price;
		String model;
		System.out.println("Please enter a range: ");
		range = input.nextInt();
		System.out.println("Please enter a max speed: ");
		speed = input.nextDouble();
		System.out.println("Please enter a fire rate: ");
		fireRate = input.nextInt();
		System.out.println("Please enter a price: ");
		price = input.nextDouble();
		System.out.println("Please enter a model: ");
		model = input.next();
		jet = new FighterJet(speed, model, range, (long) price, fireRate);
		return jet;
	}

	private static Jet promptForJet() {
		Jet jet;
		int range;
		double speed, price;
		String model;
		System.out.println("Please enter a range: ");
		range = input.nextInt();
		System.out.println("Please enter a price: ");
		price = input.nextDouble();
		System.out.println("Please enter a max speed: ");
		speed = input.nextDouble();
		System.out.println("Please enter a model: ");
		model = input.next();
		jet = new JetImpl(speed, model, range, (long) price);
		return jet;
	}

	private static void flyAllJets() {
		double mach;
		for (int i = 0; i < airField.currentJetIndex; i++) {
			mach = jets[i].getSpeedInMach();
			System.out.println(mach + " is this planes speed in MACH.");
			jets[i].fly();
		}
	}

	private static void listFleet() {
		for (int i = 0; i < airField.currentJetIndex; i++) {
			System.out.println("Model: " + jets[i].getModel() + "\nMax Speed: " + jets[i].getSpeed() + "\nRange: "
					+ jets[i].getRange() + "\nPrice: " + jets[i].getPrice());
			System.out.println();
		}
	}

	private static void displayUserMenu() {
		StringBuilder sb = new StringBuilder("Please make a numbered selection\n").append("1. List fleet\n")
				.append("2. Fly all jets\n").append("3. View fastest jet\n").append("4. View jet with longest range\n")
				.append("5. Load all cargo jets\n").append("6. DOGFIGHT!!!\n").append("7. Add a jet to the Fleet\n")
				.append("8. Quit");
		System.out.println(sb);
	}

	private static void launch() {
		int choice;
		airField = new AirField(jets);
		airField.addJet(new JetImpl(250, "Cessna", 500, 250000));
		airField.addJet(new FighterJet(1500, "F-17", 2000, 14500000, 6000));
		airField.addJet(new FighterJet(3000, "SZ-44", 4500, 15500000, 3500));
		airField.addJet(new FighterJet(4000, "F-22", 2600, 13500000, 7500));
		airField.addJet(new CargoPlane(400, "A-330", 2000, 20000000, 450000));

		input = new Scanner(System.in);
		System.out.println("----Welcome to the airfield----");
		do {
			displayUserMenu();
			choice = input.nextInt();
			switch (choice) {
			case 1:
				listFleet();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				System.out.println("The fastest jet is:\n");
				viewFastestJet();
				System.out.println();
				break;
			case 4:
				System.out.println("The jet with the longest range is:\n");
				viewLongestRange();
				System.out.println();
				break;
			case 5:
				System.out.println();
				loadAllCargo();
				break;
			case 6:
				System.out.println();
				dogfight();
				break;
			case 7:
				Jet newOne = getNewJet();
				airField.addJet(newOne);
				System.out.println();
				newOne.toString();
				System.out.println();
				break;
			case 8:
				System.out.println("Thank you for visiting. Fly back soon!");
				break;
			}
		} while (choice != 8);
	}
}
