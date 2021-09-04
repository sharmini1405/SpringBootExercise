package com.sharmi.BankDatabase.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Employee {
	@Id
	private int empid;
	private String name;
	private double salary;
	private int age;
	@ManyToOne()
	@JoinColumn(name = "bank_id",referencedColumnName = "bankid")
	private Bank bank;
	public Employee(int empid, String name, double salary, int age, Bank bank) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.bank = bank;
	}
	public Employee() {
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
}
