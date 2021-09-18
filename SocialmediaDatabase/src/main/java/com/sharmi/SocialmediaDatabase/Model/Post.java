package com.sharmi.SocialmediaDatabase.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Post {
@Id
private Long postid;
private String title;
private String content;
private String datetime;
@ManyToOne
@JoinColumn(name="owner",referencedColumnName = "userid")
private User owner;
@OneToMany(mappedBy = "commentedIn")
private List<Comment> comments;
public Post(Long postid, String title, String content, String datetime, User owner, List<Comment> comments) {
	super();
	this.postid = postid;
	this.title = title;
	this.content = content;
	this.datetime = datetime;
	this.owner = owner;
	this.comments = comments;
}
public Post() {
	super();
}
public Long getPostid() {
	return postid;
}
public void setPostid(Long postid) {
	this.postid = postid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getDatetime() {
	return datetime;
}
public void setDatetime(String datetime) {
	this.datetime = datetime;
}
public User getOwner() {
	return owner;
}
public void setOwner(User owner) {
	this.owner = owner;
}
public List<Comment> getComments() {
	return comments;
}
public void setComments(List<Comment> comments) {
	this.comments = comments;
}


}
