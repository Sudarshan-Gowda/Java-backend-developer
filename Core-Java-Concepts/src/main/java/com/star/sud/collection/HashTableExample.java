package com.star.sud.collection;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {

		Hashtable<Integer, String> map = new Hashtable<>();

		map.put(4, "Test-05");
		map.put(5, "Test-06");
		map.put(6, "Test-07");
		map.put(7, "Test-08");
		map.put(0, "Test-01");
		map.put(1, "Test-02");
		map.put(2, "Test-03");
		map.put(3, "Test-04");
		// map.put(10, null); //java.lang.NullPointerException
		// map.put(null, null); //java.lang.NullPointerException

		map.forEach((a, b) -> {
			System.out.println(a + " --> " + b);
		});

	}

}
