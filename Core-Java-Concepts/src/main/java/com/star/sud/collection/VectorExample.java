package com.star.sud.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();
		vector.add("TEST-01");
		vector.add("TEST-02");
		vector.add("TEST-03");
		vector.add("TEST-04");
		vector.add("TEST-05");
		vector.add("TEST-06");

		vector.add("TEST-01");
		vector.add("TEST-02");
		vector.add("TEST-03");
		vector.add("TEST-04");
		vector.add("TEST-05");
		vector.add("TEST-06");

		vector.stream().forEach(System.out::println);

		System.out.println("------");
		System.out.println(vector.get(0));

		System.out.println("~~~~~~~~~~ Traverse using Iterator ~~~~~~~~~~~");
		Iterator<String> iterator = vector.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		System.out.println("~~~~~~~~~~ Traverse using Enumeration ~~~~~~~~~~~");
		Enumeration<String> elements = vector.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}

		vector.remove("TEST-06");
		vector.remove(0);

		System.out.println("------------");

		vector.stream().forEach(System.out::println);

		// Numbers Examples
		System.out.println("~~~~~~ Number Examples ~~~~~~~~");
		List<Integer> asList = Arrays.asList(4, 7, 5, 2, 3, 6, 1, 4);

		System.out.println("~~~~ Sorting elements using ascending order ~~~~~");
		asList.stream().sorted().forEach(System.out::println);

		System.out.println("~~~~ Sorting elements using descending order ~~~~~");
		asList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("~~~~ Sorting elements using natural order ~~~~~");
		asList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		System.out.println("~~~~ Skip & limit operation ~~~~~~");
		asList.stream().sorted().distinct().limit(3).skip(2).forEach(System.out::println);

	}

}
