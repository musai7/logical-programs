package com.day6.logicalprograms;

import java.util.Scanner;

public class TemperaturConvertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" for degC to degF type -->degF or for degF to degC type --> degC ");
		String degree = sc.next();
		System.out.println("enter temperature reading : ");
		int temperatureReading = sc.nextInt();
		DegreeConversion.temperatureConversion(degree, temperatureReading);
	}

}
