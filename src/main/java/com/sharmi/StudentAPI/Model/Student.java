package com.sharmi.StudentAPI.Model;

public class Student extends PrimaryId<String> {

	private String name;
	private int age;
	private double gpa;
	
	
	public Student(String id, String name, int age, double gpa) {
		
		this.Id = id;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	

}
