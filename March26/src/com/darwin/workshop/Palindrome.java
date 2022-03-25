package com.darwin.workshop;

public class Palindrome {
	public static void main(String[] args) {
		String input="MADAM";
		System.out.println(isPlaindrome(input));
	}

	private static boolean isPlaindrome(String input) {
		if (input == null || input.length() <= 0) {
			return true;
		}
		int left = 0;
		int right = input.length() - 1;
		while (left < right) {
			if (input.charAt(left) != input.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
