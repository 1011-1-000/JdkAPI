package com.java.nowcoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindNumsAppearOnce {
	
	 public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Integer[] num = {0,0};
        
        if(array.length < 2){
        	num1[0] = 0;
        	num2[0] = 0;
        	return;
        }
        
        for(int i = 0; i < array.length; i++){
            if(map.get(array[i]) == null){
                map.put(array[i],1);
            }
            else{
                map.put(array[i],map.get(array[i]) + 1);
            }
        }
        
        Iterator it = map.entrySet().iterator();
        int i = 0;
        while(it.hasNext()){
        	Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>)it.next();
        	if(entry.getValue() == 1){
        		num[i++] = entry.getKey();
        	}
        	if(i == 2){
        		break;
        	}
        }
        
        num1[0] = num[0];
        num2[0] = num[1];
    }
	 
	public static void main(String[] args){
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		int[] array = {1};
		FindNumsAppearOnce(array,num1,num2);
		System.out.println(num1[0]);
		System.out.println(num2[0]);
	}
}
