package com.star.sud.java8.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationExample {

	public static void main(String[] args) {

		// Terminal operations - These operations are used to produce results. They
		// can’t be used for chaining the other methods. Below are the examples −
		// 1.forEach
		// 2.count
		// 3.toArray

		// allMatch()
		// anyMatch()
		// noneMatch()
		// collect()
		// count()
		// forEach()
		// min()
		// max()

		// collect
		List<String> id = Arrays.asList("Classes", "Methods", "Members");
		List<String> collect = id.stream().filter(s -> s.startsWith("M")).collect(Collectors.toList());
		System.out.println(collect);

		// reduce
		List<Integer> list1 = Arrays.asList(11, 33, 44, 21);
		int even = list1.stream().filter(x -> x > 0).reduce(0, (ans, i) -> ans + i);
		System.out.println(even);

		// forEach
		List<Integer> asList = Arrays.asList(1, 3, 5, 7);
		asList.stream().map(a -> a * a * a).forEach(b -> System.out.println(b));

		Object[] array = id.toArray();
		System.out.println(array);

	}

}
