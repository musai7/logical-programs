package com.day6.logicalprograms;

public class DegreeConversion {
	public static void temperatureConversion(String degree,int temperatureReading ) {
		switch (degree) {
		case "degF":
			int degF = (temperatureReading * 9 / 5) + 32;
			System.out.println("degF is " + degF);
			break;
		case "degC":
			int degC = (temperatureReading - 32) * 5 / 9;
			System.out.println("degc is " + degC);
			break;
		default:
			System.out.println("invalid selection for unit conversion ");
		}
	}

}
