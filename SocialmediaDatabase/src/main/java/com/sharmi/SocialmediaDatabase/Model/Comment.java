package com.sharmi.SocialmediaDatabase.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Comment {
	@Id
	private Long commentid;
	private String comment;
	private String datetime;
	@ManyToOne
	@JoinColumn(name="commentedBy",referencedColumnName="userid")
	private User commentedBy;
	@ManyToOne
	@JoinColumn(name="commentedIn",referencedColumnName = "postid")
	private Post commentedIn;
	public Comment(Long commentid, String comment, String datetime, User commentedBy, Post commentedIn) {
		super();
		this.commentid = commentid;
		this.comment = comment;
		this.datetime = datetime;
		this.commentedBy = commentedBy;
		this.commentedIn = commentedIn;
	}
	public Comment() {
		super();
	}
	public Long getCommentid() {
		return commentid;
	}
	public void setCommentid(Long commentid) {
		this.commentid = commentid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public User getCommentedBy() {
		return commentedBy;
	}
	public void setCommentedBy(User commentedBy) {
		this.commentedBy = commentedBy;
	}
	public Post getCommentedIn() {
		return commentedIn;
	}
	public void setCommentedIn(Post commentedIn) {
		this.commentedIn = commentedIn;
	}
	
	
	
}
