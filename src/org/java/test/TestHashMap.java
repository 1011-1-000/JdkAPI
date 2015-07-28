package org.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.java.util.JavaUtils;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 1000000; i++)
        {
            map.put(i + "", "hello world");
        }
        
        long startTime = System.nanoTime();
        printMap1(map);
        System.out.print("第一种：");
        JavaUtils.getDuration(startTime);
        startTime = System.nanoTime();
        printMap2(map);
        System.out.print("第二种：");
        JavaUtils.getDuration(startTime);
        startTime = System.nanoTime();
        printMap3(map);
        System.out.print("第三种：");
        JavaUtils.getDuration(startTime);
        startTime = System.nanoTime();
        printMap4(map);
        System.out.print("第四种：");
        JavaUtils.getDuration(startTime);
	}
	
	public static void printMap1(HashMap<String,String> map){
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry)iter.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
		}
	}
	
	public static void printMap2(HashMap<String,String> map){
		for(Map.Entry<String,String> entry : map.entrySet()){
			Object key = entry.getKey();
			Object value = entry.getValue();
		}
	}
	
	public static void printMap3(HashMap<String,String> map){
		Iterator iter = map.keySet().iterator();
		while(iter.hasNext()){
			Object key = iter.next();
			Object value = map.get(key);
		}
	}
	
	public static void printMap4(HashMap<String,String> map){
		for(String key : map.keySet()){
			Object key1 = key;
			Object value = map.get(key);
		}
	}
}
