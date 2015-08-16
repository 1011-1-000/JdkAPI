package com.java.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class FindNumbersWithSum {
	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		
        ArrayList<Integer> result = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < array.length;i++){
        	int position = Arrays.binarySearch(array, sum-array[i]);
        	if(position >= 0){
        		if(min == Integer.MAX_VALUE){
        			min = array[i];
        			max = array[position];
        		}
        		else if(array[i]*array[position] < min * max){
        			min = array[i];
        			max = array[position];
        		}
        	}
        }
        
        if(min != Integer.MAX_VALUE && max != Integer.MAX_VALUE){
        	result.add(min);
            result.add(max);
        }
        return result;
    }
	
	public static void main(String[] args){
		int[] array = {1,2,4,7,11,16};
		System.out.println(FindNumbersWithSum(array,10));
	}
}
