package com.star.sud.collection.practice.comparable;

public class Student implements Comparable<Student> {

	private Integer stdId;
	private String stdName;

	public Student() {
		super();
	}

	public Student(Integer stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + "]";
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	@Override
	public int compareTo(Student o) {
		// Ascending
		// return this.stdId.compareTo(o.stdId);
		// Descending
		return o.stdId.compareTo(this.stdId);

	}

}
