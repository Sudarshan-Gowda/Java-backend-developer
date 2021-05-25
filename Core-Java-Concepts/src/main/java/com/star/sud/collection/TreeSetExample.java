package com.star.sud.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		// 1. TreeSet doesn't allow duplicate and null values & It doesn't preserve
		// insertion order
		// 2. TreeSet stores based on some sorting order & by default it follows natural
		// ascending order

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(6);
		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(5);
		treeSet.add(4);
		treeSet.add(4);
		treeSet.add(0);
		// treeSet.add(null);
		treeSet.stream().forEach(System.out::println);

		System.out.println("Removal Check");
		treeSet.remove(1);
		treeSet.stream().forEach(System.out::println);

		TreeSet<String> treeSetStr = new TreeSet<>();
		treeSetStr.add("Test-03");
		treeSetStr.add("Test-01");
		treeSetStr.add("Test-02");
		treeSetStr.add("Test-01");
		treeSetStr.add("Test-02");
		treeSetStr.add("Test-03");
		treeSetStr.add("");
		treeSetStr.stream().forEach(System.out::println);

		//treeSetStr.remove(2);

	}

}
