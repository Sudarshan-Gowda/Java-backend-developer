package com.star.sud.basics.createObject;

public class EmployeeTest {

	public EmployeeTest() {

	}

	private int empId;

	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void display(String message) {
		System.out.println("calling display method from -> " + message);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
