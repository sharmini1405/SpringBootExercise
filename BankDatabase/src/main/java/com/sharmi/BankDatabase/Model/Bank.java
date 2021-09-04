package com.sharmi.BankDatabase.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int bankid;
	private String name;
	@OneToMany(mappedBy="bank")
	private List<Employee> employees;
	@OneToMany(mappedBy="bank")
	private List<Account> accounts;
	
	public Bank() {
		
	}
	public Bank(int bankid, String name, List<Employee> employees, List<Account> accounts) {
		super();
		this.bankid = bankid;
		this.name = name;
		this.employees = employees;
		this.accounts = accounts;
	}
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}
