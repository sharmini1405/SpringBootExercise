package com.sharmi.DressSewer.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Sewer {
@Id
private String sewerId;
private String name;
private double salary;
@ManyToMany(mappedBy = "sewers")
private List<Dress>dresses=new ArrayList<Dress>();


public Sewer(String sewerId, String name, double salary, List<Dress> dresses) {
	super();
	this.sewerId = sewerId;
	this.name = name;
	this.salary = salary;
	this.dresses = dresses;
}
public Sewer() {
	super();
}
public String getSewerId() {
	return sewerId;
}
public void setSewerId(String sewerId) {
	this.sewerId = sewerId;
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
@JsonIgnore
public List<Dress> getDresses() {
	return dresses;
}

public void setDresses(List<Dress> dresses) {
	this.dresses = dresses;
}



}
