package com.java.nowcoder;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNotRepeatingChar {
	public static int firstNotRepeatingChar(String str) {
        if(str.length() <= 0){
            return -1;
        }
        else{
            char[] c = str.toCharArray();
            Character k = 1;
            
            Map<Character,Integer> memory = new LinkedHashMap<Character, Integer>();
            for(int i = 0; i < c.length; i++){
            	if(memory.get(c[i]) == null){
            		memory.put(c[i], 1);
            	}
            	else{
            		memory.put(c[i], memory.get(c[i])+1);
            	}
            }
            
            Iterator it = memory.entrySet().iterator();
            int i = 0;
            while(it.hasNext()){
            	Map.Entry<Character, Integer> entry = (Entry<Character, Integer>) it.next();
            	if(entry.getValue() == 1){
            		k = entry.getKey();
            		break;
            	}
            }
            
            return str.indexOf(k);
        }
    }
	
	public static void main(String[] args){
		System.out.println(firstNotRepeatingChar("abbdfaderadg"));
	}
}
