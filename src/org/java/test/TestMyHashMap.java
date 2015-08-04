package org.java.test;

import org.java.util.MyHashMap;

public class TestMyHashMap {
	public static void main(String[] args){
		MyHashMap<String,String> map = new MyHashMap<String, String>();
		
		map.put("Leo", "CHINA");
		map.put("Libra", "CHINA");
		map.put("Jim", "NJ");
		map.put("Tom", "US");
		map.put("Lucy", "EN");
		
		System.out.println(map.get("Leo"));
		System.out.println(map.get("Libra"));
		System.out.println(map.get("Jim"));
		System.out.println(map.get("Tom"));
		System.out.println(map.get("Lucy"));
		
	}
}
