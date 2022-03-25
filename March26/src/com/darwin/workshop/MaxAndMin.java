package com.darwin.workshop;

import java.util.Scanner;

public class MaxAndMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of array:");
		int size = sc.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter no " + (i + 1) + " ");
			input[i] = sc.nextInt();
		}
		sc.close();
		printMaxAndMin(input);

	}

	private static void printMaxAndMin(int[] input) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < input.length; i++) {
			max = Math.max(max, input[i]);
			min = Math.min(min, input[i]);
		}
		System.out.println("Max " + max);
		System.out.println("Min " + min);
	}
}
