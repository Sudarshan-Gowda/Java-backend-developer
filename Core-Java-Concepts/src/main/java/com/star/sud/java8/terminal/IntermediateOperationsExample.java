package com.star.sud.java8.terminal;

import java.util.ArrayList;
import java.util.List;

public class IntermediateOperationsExample {

	public static void main(String[] args) {

		// Intermediate Operation- These operations are used to pipeline other methods
		// and to transform into the other streams. They don’t produce results because
		// these operation does not invoke until the terminal operation gets executed.
		// Below are the examples −

		// 01. sorted(Comparator<T>)
		// 02. peek(Consumer<T>)
		// 03. distinct()

		// filter()
		// map()
		// flatMap()
		// distinct()
		// sorted()
		// peek()
		// limit()
		// skip()

		List<String> laptopList = new ArrayList<>();
		laptopList.add("DELL");
		laptopList.add("ACER");
		laptopList.add("HCL");

		// Intermediate operation
		laptopList.sort((p1, p2) -> p1.compareTo(p2));

		// Terminal Operation
		laptopList.forEach(a -> {
			System.out.println(a);
		});

	}

}
