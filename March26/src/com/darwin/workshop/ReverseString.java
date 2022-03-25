package com.darwin.workshop;

public class ReverseString {
	public static void main(String[] args) {
		String input="darwin"; //niwrad
		System.out.println(reverse(input));
	}

	private static String reverse(String input) {
		String reverseString = "";
		for (int i = 0; i < input.length(); i++) {
			reverseString = input.charAt(i) + reverseString ;
		}
		return reverseString;
	}
}
