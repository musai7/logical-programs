package com.day6.logicalprograms;

import java.util.Scanner;

public class VendingMachine {
	public static void changeInNotes(int rupees) {
		int numberOfNotes = 0, noOfIndividualNotes = 0;
		while (rupees != 0) {
			if (rupees > 1000) {
				noOfIndividualNotes = numberOfNotes + rupees / 1000;
				numberOfNotes += noOfIndividualNotes;
				rupees = rupees % 1000;
				System.out.println("number of 1000 rupees notes is " + noOfIndividualNotes);

			} else if (rupees > 500 && rupees <= 1000) {
				noOfIndividualNotes = rupees / 500;
				numberOfNotes += noOfIndividualNotes;
				rupees = rupees % 500;
				System.out.println("number of 500 rupees notes is " + noOfIndividualNotes);

			} else if (rupees > 100 && rupees <= 500) {
				noOfIndividualNotes = rupees / 100;
				numberOfNotes += noOfIndividualNotes;
				rupees = rupees % 100;
				System.out.println("number of 100 rupees notes is " + noOfIndividualNotes);

			} else if (rupees > 50 && rupees <= 100) {
				noOfIndividualNotes = rupees / 50;
				numberOfNotes += noOfIndividualNotes;
				rupees = rupees % 50;
				System.out.println("number of 50 rupees notes is " + noOfIndividualNotes);

			} else if (rupees > 20 && rupees <= 50) {
				noOfIndividualNotes = rupees / 20;
				numberOfNotes += noOfIndividualNotes;
				rupees = rupees % 20;
				System.out.println("number of 20 rupees notes is " + noOfIndividualNotes);

			} else if (rupees > 10 && rupees <= 20) {
				noOfIndividualNotes = rupees / 10;
				numberOfNotes += noOfIndividualNotes;
				rupees = rupees % 10;
				System.out.println("number of 10 rupees notes is " + noOfIndividualNotes);

			} else if (rupees > 5 && rupees <= 10) {
				noOfIndividualNotes = rupees / 5;
				numberOfNotes += noOfIndividualNotes;
				rupees = rupees % 5;
				System.out.println("number of 5 ruppes notes is " + noOfIndividualNotes);

			} else if (rupees > 2 && rupees <= 5) {
				rupees = rupees % 2;
				numberOfNotes += noOfIndividualNotes;
				System.out.println("number of 2 ruppes notes is " + noOfIndividualNotes);

			} else {
				noOfIndividualNotes = rupees / 1;
				rupees = rupees % 1;
				numberOfNotes += noOfIndividualNotes;
				System.out.println("number of 1 rupee notes is " + noOfIndividualNotes);
			}
		}
		System.out.println(numberOfNotes);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rupees to get change");
		int rupees = sc.nextInt();
		VendingMachine.changeInNotes(rupees);

	}
}
