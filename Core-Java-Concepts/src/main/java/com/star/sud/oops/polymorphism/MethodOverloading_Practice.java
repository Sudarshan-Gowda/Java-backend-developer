package com.star.sud.oops.polymorphism;

public class MethodOverloading_Practice {

	// In java, method overloading is not possible by changing the return type of
	// the method only because of ambiguity.

	public static void main(String[] args) {

	}

}

class Adder04 {
	// static int add(int a, int b) {
	// return a + b;
	// }

	// static double add(int a, int b) {
	// return a + b;
	// }
}

class TestOverloading3 {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));// ambiguity
	}
}
