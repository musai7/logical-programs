package com.day6.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		
		int sumOfFactors=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number to check strong number or not ");
		int strongNum=sc.nextInt();
		for (int i=1;i<strongNum;i++) {
			if(strongNum%i==0) {
				sumOfFactors+=i;
				
			}
		}
		if(sumOfFactors==strongNum) {
			System.out.println(" enter number is strong number : "+sumOfFactors);
		}
		else
			System.out.println(" enter number is not a  strong number : "+sumOfFactors);
	}

}
