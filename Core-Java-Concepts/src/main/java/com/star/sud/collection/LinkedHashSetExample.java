package com.star.sud.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		// 1. It stores unique elements - Doesn't allow duplicate and null values(max 1
		// null value)
		// 2. It preserve insertion Order

		LinkedHashSet<Integer> linkedHS = new LinkedHashSet<>();
		linkedHS.add(3);
		linkedHS.add(6);
		linkedHS.add(2);
		linkedHS.add(4);
		linkedHS.add(1);
		linkedHS.add(5);
		linkedHS.add(5);
		linkedHS.add(4);
		linkedHS.add(4);
		linkedHS.add(0);
		linkedHS.add(null);

		linkedHS.stream().forEach(System.out::println);

		System.out.println("--------------------");

		linkedHS.remove(1);
		linkedHS.stream().forEach(System.out::println);

		System.out.println("--------------------");

		// String Test
		LinkedHashSet<String> lkHsSt = new LinkedHashSet<>();
		lkHsSt.add("Test-03");
		lkHsSt.add("Test-01");
		lkHsSt.add("Test-02");
		lkHsSt.add("Test-01");
		lkHsSt.add("Test-02");
		lkHsSt.add("Test-03");
		lkHsSt.add(null);
		lkHsSt.stream().forEach(System.out::println);
		System.out.println("--------------------");

	}

}
