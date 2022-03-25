package com.darwin.workshop;

import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length of array:");
		int size=sc.nextInt();
		int[] input=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Please enter no "+(i+1)+" ");
			input[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Average "+averageOfNumbers(input));
	}

	private static float averageOfNumbers(int[] input) {
		float sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		return sum / input.length;
	}
}
