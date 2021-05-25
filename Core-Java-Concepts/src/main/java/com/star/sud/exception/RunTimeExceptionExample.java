package com.star.sud.exception;

public class RunTimeExceptionExample {

	public static void main(String[] args) {

		uncehckedExceptionWithtHandle();
	}

	// ArrayIndexOutOfBoundsException
	static void uncehckedExceptionWithtHandle() {

		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The specified index does not exist " + "in array. Please correct the error.");
		}

	}

	// ArrayIndexOutOfBoundsException
	static void uncehckedExceptionWithoutHandle() {

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(arr[7]);

	}

}
