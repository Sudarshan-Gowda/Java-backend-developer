package com.star.sud.oops.polymorphism;

public class MethodOverloading {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(int a, double b) {
		return a + b;
	}

	public double add(double a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public double add(double a, double b, int c) {
		return a + b;
	}

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();

		int add = obj.add(5, 10);
		System.out.println(add);

		int add1 = obj.add(5, 10, 15);
		System.out.println(add1);

		double add2 = obj.add(5, 10.5);
		System.out.println(add2);

		double add3 = obj.add(5.5, 10.5);
		System.out.println(add3);

		double add4 = obj.add(5.5, 10);
		System.out.println(add4);

	}

}
