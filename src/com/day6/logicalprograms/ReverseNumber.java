package com.day6.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int revNumber=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num =sc.nextInt();
		while(num!=0) {
			int rem=num%10;
			revNumber=revNumber*10+rem;
			num=num/10;
		}
		System.out.println("reverse of a number "+num+"is : "+revNumber);
	}

}
