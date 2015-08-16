package com.java.nowcoder;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstAppearingOnce {
	private static String str = "";
    private static Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
    //Insert one char from stringstream
    public static void Insert(char ch)
    {
        str += ch;
        if(map.get(ch) == null){
            map.put(ch,1);
        }
        else{
            map.put(ch,map.get(ch) +1);
        }
    }
  //return the first appearence once char in current stringstream
    public static char FirstAppearingOnce()
    {
    	Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> entry = (Map.Entry<Character,Integer>)it.next();
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return '#';
    }
    
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
    	String s = in.next();
    	char[] c = s.toCharArray();
    	for(int i = 0; i < c.length; i++){
    		Insert(c[i]);
    		System.out.print(FirstAppearingOnce()+" ");
    	}
    }
}
