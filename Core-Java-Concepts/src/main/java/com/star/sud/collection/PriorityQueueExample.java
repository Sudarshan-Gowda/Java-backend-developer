package com.star.sud.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		// 1. Allows Duplicate
		// 2. To store elements which are prior to processing
		// 3. It follows FIFO order
		// 4. It uses head and tail concept to store the elements

		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("User-03");
		pq.add("User-04");
		pq.add("Demo-01");
		pq.add("User-01");
		pq.add("User-02");

		// Allows Duplicate
		pq.add("User-05");
		pq.add("User-05");
		pq.add("User-05");
		pq.add("Demo-01");

		pq.stream().forEach(System.out::println);

		System.out.println("---------------");

		pq.remove("User-03");
		pq.remove("Demo-01");

		pq.stream().forEach(System.out::println);

		System.out.println("---------------");

		PriorityQueue<Integer> numbs = new PriorityQueue<>();
		numbs.add(2);
		numbs.add(3);
		numbs.add(1);
		numbs.add(5);
		numbs.add(4);

		numbs.stream().forEach(System.out::println);

		System.out.println("---------------");
		Iterator<Integer> its = numbs.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}

		System.out.println("---------------");
		Enumeration<Integer> enumeration = Collections.enumeration(numbs);
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		System.out.println("---------------");
		numbs.remove();
		numbs.stream().forEach(System.out::println);

		System.out.println("---------------");
		numbs.remove(4);
		numbs.stream().forEach(System.out::println);

	}

}
