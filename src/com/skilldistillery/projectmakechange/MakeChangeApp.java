package com.skilldistillery.projectmakechange;

import java.util.Scanner;

public class MakeChangeApp {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the price of the item:");
		double price = kb.nextDouble();
		System.out.println("Money recieved:");
		double cash = kb.nextDouble();
		if (cash < price) {
			System.out.println("Not enough cash given");
			System.out.println("Error");

		} else if (cash == price) {
			System.out.println("Exact cash given, no change due");
		} else if (cash > price) {
			double change = cash - price;
			changeGiven(change);
			System.out.println("Change: " + change);
		}
		kb.close();
	}

	public static void changeGiven(double change) {
		int twenties = 2000;
		int tens = 1000;
		int fives = 500;
		int ones = 100;
		int quarters = 25;
		int dimes = 10;
		int nickels = 5;
		int pennies = 1;
		int changeOutput = (int) (change * 100);

		int changeInTwenties = changeOutput / twenties;
		changeOutput = changeOutput % twenties;
		if (changeInTwenties != 0) {
			System.out.println("Change: " + changeInTwenties  + " twenties");
			// printChange(changeInTwenties);
		}
		int changeInTens = changeOutput / tens;
		changeOutput = changeOutput % tens;
		if (changeInTens != 0) {
			System.out.println("Change: " + changeInTens + " tens");
			// printChange(changeInTens);
		}
		int changeInFives = changeOutput / fives;
		changeOutput = changeOutput % fives;
		if (changeInFives != 0) {
			System.out.println("Change: " + changeInFives + " fives");
			// printChange(changeInFives);
		}
		int changeInOnes = changeOutput / ones;
		changeOutput = changeOutput % ones;
		if (changeInOnes != 0) {
			System.out.println("Change: " + changeInOnes + " ones");
			// printChange(changeInOnes);
		}
		int changeInQuarters = changeOutput / quarters;
		changeOutput = changeOutput % quarters;
		if (changeInQuarters != 0) {
			System.out.println("Change: " + changeInQuarters + " quarters");
			// printChange(changeInQuarters);
		}
		int changeInDimes = changeOutput / dimes;
		changeOutput = changeOutput % dimes;
		if (changeInDimes != 0) {
			System.out.println("Change: " + changeInDimes + " dimes");
			// printChange(changeInDimes);
		}
		int changeInNickels = changeOutput / nickels;
		changeOutput = changeOutput % nickels;
		if (changeInNickels != 0) {
			System.out.println("Change: " + changeInNickels + " nickels");
			// printChange(changeInNickels);
		}
		int changeInPennies = changeOutput / pennies;
		changeOutput = changeOutput % pennies;
		if (changeInPennies != 0) {
			System.out.println("Change: " + changeInPennies + " pennies");
			// printChange(changeInPennies);
		}
	}

	// public static void printChange(int change) {
	// int changeOutput = (int) (change * 100);

	// System.out.println("Change: " + changeOutput);
}
// }
