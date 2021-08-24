package com.sharmi.StudentAPI.Model;

public class PrimaryId<T> {
	protected T Id;
	
	public PrimaryId() {
	
	
	}
	
	
	public T getId()
	{
		return Id;
	}

	public void setId(T id) {
		this.Id = id;
	}
	
}
