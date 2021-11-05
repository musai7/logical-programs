package com.day6.logicalprograms;

import java.util.Scanner;

public class StopWatch {
	public static long startTimer() {
		return System.currentTimeMillis();
	}

	public static long stopTimer() {
		return System.currentTimeMillis();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any key to start the stop watch ");
		sc.next();
		int startTime = (int) StopWatch.startTimer();
		System.out.println(" stop watch runnining..... ");
		System.out.println("enter any key to stop the stop watch ");
		sc.next();
		int stopTime = (int) StopWatch.stopTimer();
		int difference = stopTime - startTime;
		System.out.println(difference);
		int milliSeconds = difference % 1000;
		difference = difference / 1000;
		int seconds = difference % 60;
		difference = difference / 60;
		int minutes = difference % 60;
		difference = difference / 60;
		int hours = difference % 60;
		System.out
				.println("stop watch time hh-mm-ss-ms : " + hours + "-" + minutes + "-" + seconds + "-" + milliSeconds);
	}

}
