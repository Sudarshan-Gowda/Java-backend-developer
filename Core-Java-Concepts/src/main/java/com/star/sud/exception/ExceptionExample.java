package com.star.sud.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int data = 100 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");

		try {
			int a[] = new int[2];
			System.out.println("Access element three :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown  :" + e);
		}
		System.out.println("Out of the block");

	}

}
