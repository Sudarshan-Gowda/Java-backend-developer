package com.star.sud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayExample01 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 5, 7, 1);
		Integer target = 8;

		List<List<Integer>> result = new ArrayList<>(new ArrayList<>());

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {

			map.put(list.get(i), i);

			int numToCheck = target - list.get(i);

			if (map.containsKey(numToCheck))

				result.add(Arrays.asList(i, map.get(numToCheck)));

		}

		System.out.println(result);

	}

}
