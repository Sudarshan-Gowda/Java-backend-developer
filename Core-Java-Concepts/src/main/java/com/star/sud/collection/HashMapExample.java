package com.star.sud.collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, null);
		map.put(1, null);

		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println("key -> " + integer + " value -> " + map.get(integer));
		}

		System.out.println("~~~~~~~~~~~~~~~~");
		map.put(0, 10);
		map.put(1, 11);
		map.put(2, 12);

		for (Integer key : map.keySet()) {
			System.out.println("key -> " + key + " value -> " + map.get(key));
		}

		HashMap<String, String> mapEx = new HashMap<>();
		mapEx.put("test-01", "01");
		mapEx.put("test-02", "02");
		mapEx.put("test-03", "03");
		mapEx.put("test-04", "04");
		mapEx.put("test-05", "05");
		mapEx.put(null, null);

		System.out.println("~~~~~~~~~~~~~~~~");

		for (String key : mapEx.keySet()) {
			System.out.println("key -> " + key + " value -> " + mapEx.get(key));
		}

		mapEx.remove("test-02");
		System.out.println("~~~~~ After removing element ~~~~~~");
		for (String key : mapEx.keySet()) {
			System.out.println("key -> " + key + " value -> " + mapEx.get(key));
		}

	}

}
