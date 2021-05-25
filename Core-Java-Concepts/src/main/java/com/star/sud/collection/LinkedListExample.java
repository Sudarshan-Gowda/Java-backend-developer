package com.star.sud.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListExample {

	public static void main(String[] args) {

		// Linked List:
		// 1. Maintains Insertion Order
		// 2. Elements can be traversed by using Iteration
		// 3. Elements can be accessed sequentially
		// 4. In-case of duplicate insertion, previous/earlier elements will be shifted
		// towards right and new elements will be placed on the start of the index

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("TEST-01");
		linkedList.add("TEST-02");
		linkedList.add("TEST-03");
		linkedList.add("TEST-04");
		linkedList.add("TEST-05");
		linkedList.add("TEST-06");

		linkedList.add(0, "DEMO-01");
		linkedList.add(0, "DEMO-02");
		linkedList.stream().forEach(System.out::println);

		// Elements Traverse - Iterator
		Iterator<String> iterators = linkedList.iterator();
		while (iterators.hasNext()) {
			System.out.println(iterators.next());
		}

		// Elements access based on the Index but internally will traverse sequentially
		String string = linkedList.get(4);
		System.out.println(string);

		// Stream Operation
		String result = linkedList.stream().filter(i -> i.contains("TEST-01")).findAny().get();
		System.out.println(result);

		List<String> collect = linkedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);

		List<String> collect01 = linkedList.stream().sorted(Comparator.reverseOrder()).skip(2)
				.collect(Collectors.toList());
		System.out.println(collect01);

		// Linked List Numbers
		////////////////////////
		List<Integer> list = Arrays.asList(4, 1, 3, 2, 5);

		// Convert List to Linked List
		LinkedList<Integer> collect2 = list.stream().collect(Collectors.toCollection(LinkedList::new));
		System.out.println(collect2);
		LinkedList<Integer> collect3 = collect2.stream().sorted().collect(Collectors.toCollection(LinkedList::new));
		System.out.println(collect3);

		LinkedList<Integer> collect4 = collect2.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(collect4);

		// Convert Array List to Linked List
		LinkedList<Integer> collect5 = Arrays.asList(4, 1, 3, 2, 5).stream()
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(collect5);

	}

}
