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
		 System.out.println("Change: " + changeOutput + " twenties");
		//printChange(changeInTwenties);

		int changeInTens = changeOutput / tens;
		changeOutput = changeOutput % tens;
		 System.out.println("Change: " + changeOutput + " tens");
		//printChange(changeInTens);

		int changeInFives = changeOutput / fives;
		changeOutput = changeOutput % fives;
		System.out.println("Change: " + changeOutput + " fives");
		//printChange(changeInFives);

		int changeInOnes = changeOutput / ones;
		changeOutput = changeOutput % ones;
		System.out.println("Change: " + changeOutput + " ones");
		//printChange(changeInOnes);

		int changeInQuarters = changeOutput / quarters;
		changeOutput = changeOutput % quarters;
		 System.out.println("Change: " + changeOutput + " quarters");
		//printChange(changeInQuarters);

		int changeInDimes = changeOutput / dimes;
		changeOutput = changeOutput % dimes;
		 System.out.println("Change: " + changeOutput + " dimes");
		//printChange(changeInDimes);

		int changeInNickels = changeOutput / nickels;
		changeOutput = changeOutput % nickels;
		System.out.println("Change: " + changeOutput + " nickels");
		//printChange(changeInNickels);

		int changeInPennies = changeOutput / pennies;
		changeOutput = changeOutput % pennies;
		System.out.println("Change: " + changeOutput + " pennies");
		//printChange(changeInPennies);

	}

	//public static void printChange(int change) {
		//int changeOutput = (int) (change * 100);

		//System.out.println("Change: " + changeOutput);
	}
//}
