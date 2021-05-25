package com.star.sud.coreconcepts.covariant;

class Test03 {

	String m1() {
		System.out.println("executing from parent");
		return "Message";
	}

}

class Test04 extends Test03 {

	// Return type of overriding method is incompatible with Test03.m1() because the
	// return type of overriding method in the subclass should not be parent. Here,
	// Object is the parent class of String. Therefore, it is not an overridden
	// method.

	// Object m1() {
	// System.out.println("executing from child");
	// return "Message";
	// }
}

public class CovariantReturnTypeExample2 {

	public static void main(String[] args) {

		Test02 test02 = new Test02();
		test02.m1();

		Test01 test01 = new Test02();
		test01.m1();

	}

}