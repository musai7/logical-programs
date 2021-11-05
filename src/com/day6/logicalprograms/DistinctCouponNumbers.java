package com.day6.logicalprograms;

import java.util.Scanner;

public class DistinctCouponNumbers {

	public static void main(String[] args) {
		int counter = 0, randomNumCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		int arr[] = new int[num];

		while (counter != num) {
			int increment = 0;
			int randomNum = RandomDemoUtil.getRandomInt(num);
			randomNumCount++;
			for (int j = 0; j < counter; j++) {
				if (randomNum == arr[j]) {
					increment++;
				}
			}
			if (increment == 0) {
				arr[counter] = randomNum;
				System.out.print(arr[counter] + " ");
				counter++;
			}
		}
		System.out.println();
		System.out.println(randomNumCount + " random numbers you need to generate a distinct coupon number");
	}
}
