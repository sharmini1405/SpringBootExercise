package com.sharmi.SocialmediaDatabase.Model;

public class Link {
	private String url;
	private String relation;
	public Link(String url, String relation) {
		super();
		this.url = url;
		this.relation = relation;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	
}
