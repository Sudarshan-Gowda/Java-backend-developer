package com.star.sud.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayListExample {

	public static void main(String[] args) {

		// Array List:
		// 01. It allows duplicate & null objects to store
		// 02. It preserves Insertion Order
		// 03. It uses Dynamic Array Data Structure
		// 04. Elements can be traversed using Iterator
		// 05. Elements can be accessed by using index
		// 06. Manipulation is slower since elements are shifting back in case if any
		// -- elements in the list are removed

		// In case of duplicates, remove method will remove first matching element

		ArrayList<String> list = new ArrayList<>();
		list.add("User-01");
		list.add("User-02");
		list.add("User-03");
		list.add("User-04");

		// Allows Duplicate
		list.add("User-05");
		list.add("User-05");
		list.add("User-05");

		// Allows duplicates (including Null & Empty(
		list.add("");
		list.add(null);

		System.out.println("~~~~~ traverse through the Iterator ~~~~");
		// Iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Maintains Insertion Order

		list.stream().forEach(System.out::println);

		list.remove(0);
		list.remove("User-05");

		System.out.println("~~~ After removing the elements ~~~");
		list.stream().forEach(System.out::println);

		// filter
		List<String> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);

		// filter
		boolean present = list.stream().filter(i -> i != null && i.contains("User-02")).findAny().isPresent();
		System.out.println(present);

		// Sorting
		List<Integer> intArray = Arrays.asList(5, 3, 1, 4, 2);
		// Using Java8
		List<Integer> collect2 = intArray.stream().sorted().collect(Collectors.toList());
		System.out.println(collect2);

		// Other way -01
		intArray.sort(Comparator.naturalOrder());
		System.out.println(intArray);

		// Other way -02
		intArray.sort(Comparator.comparing(Integer::new));
		System.out.println(intArray);

		// Other way -03
		Collections.sort(intArray);
		System.out.println(intArray);

		// Conversion
		List<Integer> asList = Arrays.asList(13, 11, 14, 12, 15);

		// List to ArrayList
		ArrayList<Integer> arrayList = new ArrayList<>(asList);
		System.out.println("List to ArrayList -> " + arrayList);

		// List to Linked List
		LinkedList<Integer> collect3 = asList.stream().collect(Collectors.toCollection(LinkedList::new));
		System.out.println("List to Linked List -> " + collect3);

		List<Integer> asList1 = Arrays.asList(13, 11, 14, 12, 15);

		// List to HashSet -- This sorts the elements by default natural ascending order
		HashSet<Integer> collect4 = asList1.stream().collect(Collectors.toCollection(HashSet::new));
		System.out.println("List to HashSet -> " + collect4);

		// List to TreeSet -- This sorts the elements by default natural ascending order
		TreeSet<Integer> collect5 = asList1.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println("List to TreeSet -> " + collect5);

		list.clear();
		System.out.println(list);

	}

}
