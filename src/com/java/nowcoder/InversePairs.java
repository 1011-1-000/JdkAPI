package com.java.nowcoder;

public class InversePairs {
	public static int inversePains(int[] array){
		int count = 0;
		for(int i =0 ; i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				if(array[i] > array[j]){
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		int[] array = {3,2,1,6,5,4};
		System.out.println(inversePains(array));
	}
}
