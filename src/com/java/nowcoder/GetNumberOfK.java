package com.java.nowcoder;

public class GetNumberOfK {
	
	public static int getNumberOfK(int [] array , int k) {
       int count = 0;
        
       for(int i = 0;i< array.length && k >= array[i];i++){
           if(array[i] == k){
               count++;
           }
       }
        
        return count;
	}
	
	public static void main(String[] args){
		int[] array = {1,2,3,3,3,3,4,5};
		System.out.println(getNumberOfK(array,3));
	}
}
