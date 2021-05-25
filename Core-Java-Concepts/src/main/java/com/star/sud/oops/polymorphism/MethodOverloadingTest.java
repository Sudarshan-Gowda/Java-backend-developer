
package com.star.sud.oops.polymorphism;

public class MethodOverloadingTest {

	public static void main(String[] args) {

		Adder.add(3, 2);
		Adder.add(5, 2);

		Adder02.add(3, 2);
		Adder02.add(1.5, 2.5);

	}

}

//01. Method Overloading: changing no. of arguments
class Adder {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

}

//2. Method Overloading: changing data type of arguments

class Adder02 {

	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}

}

