package org.java.util;

public class MyHashMap<K,V> {
	private Entry[] table;
	static final int DEFAULT_INITIAL_CAPACITY = 16;
	private int size;
	
	public MyHashMap(){
		table = new Entry[DEFAULT_INITIAL_CAPACITY];
		size = DEFAULT_INITIAL_CAPACITY;
	}
	
	public int getSize(){
		return size;
	}
	
	static int indexFor(int h,int length){
		return h%(length-1);
	}
	
	public V get(Object key){
		if(key == null){
			return null;
		}
		int hash = key.hashCode();
		int index = indexFor(hash,table.length);
		for(Entry<K,V> e = table[index];e != null; e= e.next){
			Object k = e.key;
			if(e.key.hashCode() == hash && (k == key || k.equals( key ))){
				return e.value;
			}
		}
		return null;
	}
	
	public V put(K key, V value){
		if(key == null){
			return null;
		}
		int hash = key.hashCode();
		int index = indexFor(hash,table.length);
		
		for(Entry<K,V> e = table[index];e!= null;e = e.next){
			Object k = e.key;
			if(e.key.hashCode() == hash && (k == key || key.equals(k))){
				V oldValue = e.value;
				e.value = value;
				return oldValue;
			}
		}
		
		Entry<K,V> e = table[index];
		table[index] = new Entry<K,V>(key,value,e);
		return null;
	}
}

class Entry<K,V>{
	final K key;
	V value;
	Entry<K,V> next;
	
	public Entry(K key, V value, Entry<K, V> next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}
	
	public final K getKey(){
		return key;
	}
	
	public final V getValue(){
		return value;
	}
	
	public final V setValue(V newValue){
		V oldValue = value;
		value = newValue;
		return oldValue;
	}
	
	public final boolean equals(Object o){
		if(!(o instanceof Entry)){
			return false;
		}
		Entry e = (Entry) o;
		Object k1 = getKey();
		Object k2 = e.getKey();
		if(k1 == k2 || (k1 != null && k1.equals(k2))){
			Object v1 = getValue();
			Object v2 = e.getValue();
			if(v1 == v2 || (v1 != null && v1.equals(v2))){
				return true;
			}
		}
		return false;
	}
	
	public final int hashCode(){
		return (key == null ? 0 : key.hashCode()) ^ (value == null? 0:value.hashCode());
	}
	
	public final String toString(){
		return getKey()+"="+getValue();
	}
}