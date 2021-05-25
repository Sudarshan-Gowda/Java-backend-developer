package com.star.sud.coreconcepts.covariant;

public class CovariantReturnTypesNotSupported {
	public static void main(String args[]) {
		Base_01 base = new Base_01();
		base.fun();

		Derived_01 derived = new Derived_01();
		derived.fun();
	}
}

class C {
}

class D extends C {
}

class Base_01 {
	D fun() {
		System.out.println("Base fun()");
		return new D();
	}
}

class Derived_01 extends Base_01 {

	// Compile time exception

	// C fun() {
	// System.out.println("Derived fun()");
	// return new C();
	// }
}
