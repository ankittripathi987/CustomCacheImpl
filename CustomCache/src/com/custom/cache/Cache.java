package com.custom.cache;

public interface Cache<K,V> {
	
	public void remove(K key);
	
	public void add(K key, V value, int time);
	
	public void get(K key);
	
	public void clear();
	 
	public long size();
	
	
}
