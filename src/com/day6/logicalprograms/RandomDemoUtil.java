package com.day6.logicalprograms;

import java.util.Random;

public final class RandomDemoUtil {
	public static int getRandomInt(int num) {
		Random random = new Random();
		return random.nextInt(num)+1;
	}
}
