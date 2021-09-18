package com.sharmi.SocialmediaDatabase.Model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement
public class User {
	@Id
	private String userid;
	private String emailid;
	private String firstname;
	private String lastname;
	private int age;
	@OneToMany(mappedBy = "owner")
	private List<Post> posts;
	@OneToMany(mappedBy="commentedBy")
	private List<Comment> comments;
	public User(String userid, String emailid, String firstname, String lastname, int age, List<Post> posts,
			List<Comment> comments) {
		super();
		this.userid = userid;
		this.emailid = emailid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.posts = posts;
		this.comments = comments;
	}
	public User() {
		super();
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
	
}
