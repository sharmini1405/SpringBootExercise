package com.sharmi.BankDatabase.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Account {
	@Id
	private int accid;
	private String acctype;
	private double balance;
	@ManyToOne
	@JoinColumn(name = "bank_id",referencedColumnName = "bankid")
	private Bank bank;
	
	
	public Account(int accid, String acctype, double balance, Bank bank) {
		super();
		this.accid = accid;
		this.acctype = acctype;
		this.balance = balance;
		this.bank = bank;
	}
	
	public Account()
	{
		
	}
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	
}
