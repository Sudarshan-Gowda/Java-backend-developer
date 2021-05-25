package com.star.sud.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(4, "Test-05");
		map.put(5, "Test-06");
		map.put(6, "Test-07");
		map.put(7, "Test-08");
		map.put(0, "Test-01");
		map.put(1, "Test-02");
		map.put(2, "Test-03");
		map.put(3, "Test-04");
		map.put(null, null);
		map.put(null, null);// override

		map.forEach((a, b) -> {
			System.out.println(a + " --> " + b);
		});

		// Remove Elements
		map.remove(2);

		map.forEach((a, b) -> {
			System.out.println(a + " --> " + b);
		});

	}

}
