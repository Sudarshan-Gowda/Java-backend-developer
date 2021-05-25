package com.star.sud.basics.compareObjects;

public class CompareObjectExample {
	public static void main(String[] args) {

		// "==" will check whether both the objects will belong/point to same memory
		// address

		// "equals()" will check the object value

		Student student01 = new Student(100, "User");
		Student student02 = new Student(100, "User");

		System.out.println(student01 == student02);

		System.out.println(student01.equals(student02));

		System.out.println(student01.hashCode());
		System.out.println(student02.hashCode());
		
		//https://www.javamadesoeasy.com/2015/02/overriding-equals-and-hashcode-method.html


	}

}
