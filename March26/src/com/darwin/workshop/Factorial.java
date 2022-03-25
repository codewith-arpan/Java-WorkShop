package com.darwin.workshop;

public class Factorial {
	public static void main(String[] args) {
		int input=5;
		System.out.println("Factorial "+factorialR(input));
	}

	private static int factorial(int input) {
		if (input == 0)
			return 1;
		int ans = 1;
		for (int i = 1; i <= input; i++) {
			ans = ans * i;
		}
		return ans;
	}
	
	private static int factorialR(int input) {
		if (input == 0) {
			return 1;
		}
		return input * factorialR(input - 1);
	}
}
