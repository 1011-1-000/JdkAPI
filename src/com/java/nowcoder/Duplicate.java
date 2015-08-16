package com.java.nowcoder;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
	public static boolean duplicate(int numbers[],int length,int [] duplication) {
		boolean flag = false;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    for(int i = 0; i < length; i++){
	    	if(map.get(numbers[i]) == null){
	    		map.put(numbers[i], 1);
	    	}
	    	else{
	    		duplication[0] = numbers[i];
	    		flag = true;
	    		break;
	    	}
	    }
	    return flag;
    }
	
	public static void main(String[] args){
		int[] numbers = {2,3,1,0,2,5,3};
		int[] result = new int[1];
		System.out.println(duplicate(numbers,numbers.length,result));
		System.out.println(result[0]);
	}
}
