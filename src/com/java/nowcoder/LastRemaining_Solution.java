package com.java.nowcoder;

import java.util.LinkedList;
import java.util.List;

public class LastRemaining_Solution {
	public static int LastRemaining_Solution(int n, int m) {
		int[] child = new int[n];
		for(int i = 0; i < n ; i++){
			child[i] = 1;
		}
		
		int index = -1;
		int length = n;
		int location = -1;
		for(int i = 0; i < n-1; i++){
			int count = 0;
			index 
			while(child[index])
		}
		for(int i = 0; i < n; i++){
			if(child[i] == 1){
				location = i + 1;
				break;
			}
		}
		
		return location;
    }
	
	public static void main(String[] args){
		System.out.println(LastRemaining_Solution(5,2));
	}
}
