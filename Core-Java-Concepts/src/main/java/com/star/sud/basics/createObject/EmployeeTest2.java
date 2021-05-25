package com.star.sud.basics.createObject;

import java.io.Serializable;

public class EmployeeTest2 implements Cloneable, Serializable {

	private static final long serialVersionUID = 7175133969317928079L;

	private int empId;

	private String empName;

	public EmployeeTest2() {
	}

	public EmployeeTest2(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void display(String message) {
		System.out.println("EmployeeTest2 --> calling display method from -> " + message);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
