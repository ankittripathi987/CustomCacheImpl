package com.custom.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomCache<K,V> implements Cache<K,V> {
	
	
	Map<K,V> customCache = new ConcurrentHashMap<>();

	@Override
	public void remove(K key) {
		
		customCache.remove(key);
	}

	@Override
	public void add(K key, V value, int time) {
		
		
	}

	@Override
	public void get(K key) {
		
		
	}

	@Override
	public void clear() {
		
		
	}

	@Override
	public long size() {
		
		return 0;
	}

}
