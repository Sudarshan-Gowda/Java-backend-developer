package com.star.sud.oops.polymorphism;

public class MethodOverridingTest {

	public static void main(String[] args) {

		TestA a = new TestA();
		a.add(2, 5);

	}

}

class TestA {

	int add(int a, int b) {
		return a + b;
	}

}

class TestB extends TestA {

	// we can't change the return type in method overriding
	// double add(int a, int b) {
	int add(int a, int b) {
		return a + b;
	}

}