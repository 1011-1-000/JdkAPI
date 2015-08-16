package com.java.nowcoder;

import java.util.ArrayList;

public class FindContinuousSequence {
	
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	       for(int i = 1; i <= sum/2 + 1; i++){
	           int s = 0;
	           ArrayList<Integer> list = new ArrayList<Integer>();
	           for(int j = i; j <= sum/2 + 1 && s < sum; j++){
	               list.add(j);
	               s += j;
	               if(sum == s){
	                   result.add(list);
	                   continue;
	               }
	           }
	       }
	       return result;
	}
	
	public static void main(String[] args){
		FindContinuousSequence f = new FindContinuousSequence();
		ArrayList<ArrayList<Integer>> result = f.FindContinuousSequence(5);
		System.out.println(result);
	}
}
