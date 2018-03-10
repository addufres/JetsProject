package com.skilldistillery.projects.jets;

import java.util.Scanner;

public class JetApplication {
	public static Scanner input;
	private static AirField airField;
	private static Jet[] jets = new Jet[7];
	protected static int currentLength = 5;

	public JetApplication() {
	}

	public static void main(String[] args) {

		launch();
	}

	private static void launch() {
		int choice;
		airField = new AirField(jets);
		jets[0] = new JetImpl(250, "Cessna", 500, 250000);
		jets[1] = new FighterJet(1500, "F-17", 2000, 14500000, 6000);
		jets[2] = new FighterJet(3000, "SZ-44", 4500, 15500000, 3500);
		jets[3] = new FighterJet(4000, "F-22", 2600, 13500000, 7500);
		jets[4] = new CargoPlane(400, "A-330", 2000, 20000000, 450000);
		
		input = new Scanner(System.in);
		System.out.println("----Welcome to the airfield----");
		do {
			displayUserMenu();
			choice = input.nextInt();
			switch(choice) {
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
				loadAllCargo();
				break;
			case 6:
				dogfight();
				break;
			case 7:
				addJet();
				break;
			case 8:
				System.out.println("Thank you for visiting. Fly back soon!");
				break;
			}
		} while (choice != 8);
		
	}

	private static void viewFastestJet() {
		Jet fastest = jets[0];
		for(int j = 0; j < jets.length; j++) {
			if(jets[j] == null) {
				currentLength = j;
				break;
			}
		}
		for (int i = 1; i < currentLength; i++) {
			if(fastest.getSpeed() < jets[i].getSpeed()) {
				fastest = jets[i];
			}
		}
		System.out.println(fastest.toString());
	}

	private static void viewLongestRange() {
		Jet longest = jets[0];
		for(int j = 0; j < jets.length; j++) {
			if(jets[j] == null) {
				currentLength = j;
				break;
			}
		}
		for (int i = 1; i < currentLength; i++) {
			if(longest.getSpeed() < jets[i].getSpeed()) {
				longest = jets[i];
			}
		}
		System.out.println(longest.toString());		
	}

	private static void loadAllCargo() {
		// TODO Auto-generated method stub
		
	}

	private static void dogfight() {
		// TODO Auto-generated method stub
		
	}

	private static void addJet() {
		// TODO Auto-generated method stub
		
	}

	private static void flyAllJets() {
		// TODO Auto-generated method stub
		
	}

	private static void listFleet() {
		// TODO Auto-generated method stub
		
	}

	private static void displayUserMenu() {
		StringBuilder sb = new StringBuilder("Please make a numbered selection\n").append("1. List fleet\n")
				.append("2. Fly all jets\n").append("3. View fastest jet\n").append("4. View jet with longest range\n")
				.append("5. Load all cargo jets\n").append("6. DOGFIGHT!!!\n").append("7. Add a jet to the Fleet\n")
				.append("8. Quit");
		System.out.println(sb);
	}
}
