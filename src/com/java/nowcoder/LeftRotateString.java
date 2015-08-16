package com.java.nowcoder;

public class LeftRotateString {
	public static String LeftRotateString(String str,int n) {
		if(str.length() == 0){
			return "";
		}
		if(str.length() > n){
			return str.substring(n) + str.substring(0,n);
		}
		else{
			n = n % str.length();
			return str.substring(n) + str.substring(0,n);
		}
    }
	
	public static void main(String[] args){
		System.out.println(LeftRotateString(",",6));
	}
}
