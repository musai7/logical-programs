package com.day6.logicalprograms;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check prime number or not : ");
		int primeNumber=sc.nextInt();
		for(int i=2;i<primeNumber/2;i++) {
			if(primeNumber%i==0) {
				temp++;
				break;
			}
		}
		if(temp==0) {
			System.out.println("given number is prime number : "+primeNumber);
		}
		else
			System.out.println("given number is not prime number ");
	}
}
