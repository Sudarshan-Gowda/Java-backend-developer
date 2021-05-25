package com.star.sud;

public class MissingNumber {

	public static void main(String[] args) {

		// List<Integer> asList = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10);

		int[] array = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		// int startCount = array[0];
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			sum += array[i];
		}

		int n = array.length + 1;
		int missingNum = (n * (n + 1)) / 2 - sum;
		System.out.println(missingNum);

	}

}
