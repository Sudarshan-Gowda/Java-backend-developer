package com.star.sud.collection.practice.comparable;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Student student1 = new Student(2, "User -2");
		Student student2 = new Student(1, "User -1");
		Student student3 = new Student(4, "User -4");
		Student student4 = new Student(3, "User -3");
		Set<Student> students = new TreeSet<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		System.out.println(students);

	}

}
