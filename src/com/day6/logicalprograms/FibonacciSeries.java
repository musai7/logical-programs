package com.day6.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int temp = 0, fib = 0, fibSeries = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to find fibonacci series ");
		int num = sc.nextInt();
		System.out.println("fibonacci series is : ");
		for (int i = 0; i < num; i++) {
			if (i >1) {
				temp = fib;
				fib = fibSeries;
				fibSeries =temp+ fib;
				 System.out.print(fibSeries+" ");
			}

			else if (i == 0) {
				 System.out.print(fibSeries+" ");
			} else {
				temp = 0;
				fibSeries = 1;
				 System.out.print(fibSeries+" ");
			}
		}

	}
}
