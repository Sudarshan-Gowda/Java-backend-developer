package com.star.sud.variable;

public class Variable {

	public static void main(String[] args) {

		// Accessing static variable:
		System.out.println(VariableEx.number1);

		// Accessing non-static variable:
		VariableEx obj2 = new VariableEx();
		System.out.println(obj2.number2);

		// Variable usage inside java function
		// Variable Declaration
		int var;

		// Initialisation
		var = 10;
		System.out.println("value of var: " + var);

		// to do it in single line
		int x = 10;
		System.out.println("Value of x :" + x);

		// Other types:
		double d = 20.0;
		long l = 20l;
		char chr = 'C';
		String name = "Admin";

		System.out.println(d);
		System.out.println(l);
		System.out.println(chr);
		System.out.println(name);

	}

}
