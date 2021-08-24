package com.sharmi.StudentAPI.Repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.sharmi.StudentAPI.Model.PrimaryId;


public class Repo<K,V extends PrimaryId<K>> {
	private Map<K,V> map=new HashMap <K,V>();
	
	public Collection<V> getAll(){
		return map.values();
	}
	
	
	
	public V get(K id)
	{
		return map.get(id);
	}
	
	public void add(V data)
	{
		map.put(data.getId(), data);
	}
	
	public void delete(K delid)
	{
		map.remove(delid);
	}
	public void update(K updateid,V newdata)
	{
		map.put(updateid, newdata);
	}
}
