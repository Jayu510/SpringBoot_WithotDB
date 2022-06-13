package com.jbk.SringBoot_WithoutDB.entity;

public class Student {

	private int eid;
	private String name;
	private double marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int eid, String name, double marks) {
		super();
		this.eid = eid;
		this.name = name;
		this.marks = marks;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [eid=" + eid + ", name=" + name + ", marks=" + marks + "]";
	}

}
