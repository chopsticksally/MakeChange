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

		} else if (cash == price) {
			System.out.println("Exact cash given, no change due");
		} else if (cash > price) {
			double change = cash - price;
			System.out.println("Change: " + change);
		}

	}
}
