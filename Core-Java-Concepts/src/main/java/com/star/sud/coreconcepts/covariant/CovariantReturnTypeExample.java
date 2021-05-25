package com.star.sud.coreconcepts.covariant;

class Test01 {

	Object m1() {
		System.out.println("executing from parent");
		return new Object();
	}

}

class Test02 extends Test01 {

	String m1() {
		System.out.println("executing from child");
		return "Message";
	}
}

public class CovariantReturnTypeExample {

	public static void main(String[] args) {

		Test02 test02 = new Test02();
		test02.m1();

		Test01 test01 = new Test02();
		test01.m1();

	}

}