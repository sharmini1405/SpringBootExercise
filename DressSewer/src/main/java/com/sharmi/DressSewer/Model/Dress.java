package com.sharmi.DressSewer.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Dress {
@Id
private String dressId;
private double price;
private String size;
private String category;
@ManyToMany
@JoinTable(name = "sewer_dresses",joinColumns = {@JoinColumn(name="dress_id",referencedColumnName = "dressId")},
inverseJoinColumns = {@JoinColumn(name="sewer_id",referencedColumnName = "sewerId")})
private List<Sewer> sewers = new ArrayList<Sewer>();

public Dress(String dressId, double price, String size, String category, List<Sewer> sewers) {
	super();
	this.dressId = dressId;
	this.price = price;
	this.size = size;
	this.category = category;
	this.sewers = sewers;
}
public Dress() {
	super();
}
public String getDressId() {
	return dressId;
}
public void setDressId(String dressId) {
	this.dressId = dressId;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@JsonIgnore
public List<Sewer> getSewers() {
	return sewers;
}
public void setSewers(List<Sewer> sewers) {
	this.sewers = sewers;
}

//public void addSewer(Sewer sewer)
//{
//	sewers.add(sewer);
//}

}
