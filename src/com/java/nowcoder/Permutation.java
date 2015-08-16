package com.java.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
	public static ArrayList<String> permutation(String str){
		char[] s = str.toCharArray();
		Arrays.sort(s);
		
		
		for(int i = 0; i < s.length; i++){
			System.out.print(s[i] + " ");
		}
		return null;
	}
	
	public static ArrayList<String> permutation(char[] s,int start,int end){
		ArrayList<String> list = new ArrayList<String>();
		if(end - start + 1== s.length){
			list.add(s.toString());
		}
	}
	public static void main(String[] args){
		permutation("fdgfwqadgve");
	}
}
