package com.star.sud.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		// 1. Hash Set does not allow duplicate values & max it allow one null values
		// 2. HashSet uses Hashing technique to store & retrieve the elements
		// 3. It allows hash table to store the elements

		HashSet<String> strHashSet = new HashSet<>();
		strHashSet.add("Test-03");
		strHashSet.add("Test-01");
		strHashSet.add("Test-02");
		strHashSet.add("Test-01");
		strHashSet.add("Test-02");
		strHashSet.add("Test-03");
		strHashSet.add("");
		strHashSet.add("");
		strHashSet.add(null);
		strHashSet.add(null);
		strHashSet.stream().forEach(System.out::println);

		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(3);
		hashSet.add(6);
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(1);
		hashSet.add(5);
		hashSet.add(5);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(0);
		hashSet.add(null);

		hashSet.stream().forEach(System.out::println);

		System.out.println("~~~~~ To remove elements ~~~~~~~");
		hashSet.remove(1);
		hashSet.remove(null);
		hashSet.stream().forEach(System.out::println);

		System.out.println("------------------------");
		// Iteration
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("Iteration through Enumeration");

		Enumeration<Integer> enumeration = Collections.enumeration(hashSet);
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());

		}

	}

}
