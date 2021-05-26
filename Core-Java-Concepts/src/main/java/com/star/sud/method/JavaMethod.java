package com.star.sud.method;

public class JavaMethod {

	public static void main(String[] args) {

		// Calling static methods
		int add2Number = MethodEx.add2Number(2, 3);
		System.out.println(add2Number);

		// Calling non static methods
		MethodEx methodEx = new MethodEx();
		int sub2Number = methodEx.sub2Number(3, 2);
		System.out.println(sub2Number);

	}

}
