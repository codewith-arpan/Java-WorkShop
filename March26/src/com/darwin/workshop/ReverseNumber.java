package com.darwin.workshop;

public class ReverseNumber {
	public static void main(String[] args) {
		int a=123; //321   //Dividend = Divisor × Quotient + Remainder.
		System.out.println(reverseNumber(a));
	}

	public static int reverseNumber(int a) {
		int ans = 0;
		while (a != 0) {
			int temp = a % 10;
			ans = ans * 10 + temp;
			a = a / 10; 
		}
		return ans;
	}
}
