package com.sharmi.StudentAPI.Model;

public class Lecturer extends PrimaryId<Long> {
	
	private String name;
	private String department;
	public Lecturer(long id, String name, String department) {
		super();
		this.Id = id;
		this.name = name;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
