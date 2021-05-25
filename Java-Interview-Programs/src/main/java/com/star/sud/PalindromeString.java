package com.star.sud;

public class PalindromeString {

	public static void main(String[] args) {

		String message = "  ABCBA  ";

		Boolean checkPalindrome = checkPalindrome(message);
		System.out.println(checkPalindrome);

	}

	static Boolean checkPalindrome(String message) {
		message = message.trim();

		if (message == null)
			return false;

		int first = 0;
		int last = message.length() - 1;

		while (first < last) {

			if (message.charAt(first) != message.charAt(last))
				return false;

			first++;
			last--;

		}

		return true;
	}

}
