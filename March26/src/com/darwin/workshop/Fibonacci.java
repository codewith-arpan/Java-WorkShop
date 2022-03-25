package com.darwin.workshop;

public class Fibonacci {
	public static void main(String[] args) {
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.. fn=f(n-1)+f(n-2)
		int input=10;
		System.out.println(input+ " term in Fibonacci Series is "+ fibonacciR(input));
	}

	private static int fibonacciR(int input) {
		if (input <= 1) {
			return input;
		}
		return fibonacciR(input - 1) + fibonacciR(input - 2);
	}
	
	private static int fibonacci(int input) {
		if (input <= 1) {
			return input;
		}
		int[] arr = new int[input+1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[arr.length-1];
	}
}
