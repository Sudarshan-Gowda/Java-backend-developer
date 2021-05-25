package com.star.sud.basics.createObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObjectExample {

	public static void main(String[] args) {

		// Using new Keyword
		// Using clone() method
		// Using newInstance() method of the Class class
		// Using newInstance() method of the Constructor class
		// Using Deserialization

		// 01. Using new Keyword
		EmployeeTest emp = new EmployeeTest();
		emp.display("Using new Keyword");

		/////////////////////////
		// 02. Using clone() method
		EmployeeTest2 emp02Old = new EmployeeTest2();
		try {
			EmployeeTest2 emp2New = (EmployeeTest2) emp02Old.clone();
			emp2New.display("Using clone()");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		/////////////////////////
		// 03. using new Instance method
		try {
			EmployeeTest newInstance = EmployeeTest.class.newInstance();
			newInstance.display("Using newInstrance() of Class");
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			@SuppressWarnings("static-access")
			EmployeeTest empTest03 = (EmployeeTest) EmployeeTest.class
					.forName("com.star.sud.basics.createObject.EmployeeTest").newInstance();
			empTest03.display("Using newInstance() of Class ex:-02");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		/////////////////////////
		// 04. Using newInstance() method of the Constructor class

		Constructor<?>[] constructors = EmployeeTest.class.getConstructors();
		for (Constructor<?> constructor : constructors) {

			try {
				EmployeeTest newInstance = (EmployeeTest) constructor.newInstance();
				newInstance.display("Using newSintace() of Constructor");

			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}

		}

		/////////////////////////
		// 05. Using Deserialization
		try {
			EmployeeTest2 empDes = new EmployeeTest2(100, "User-01");
			FileOutputStream fos = new FileOutputStream("employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(empDes);
			oos.flush();
			oos.close();
			System.out.println("Successfully Created");

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.txt"));
			EmployeeTest2 empResp = (EmployeeTest2) ois.readObject();
			System.out.println(empResp.getEmpId() + " " + empResp.getEmpName());
			ois.close();

		} catch (IOException | ClassCastException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
