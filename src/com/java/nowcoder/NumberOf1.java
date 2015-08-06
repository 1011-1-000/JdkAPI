package com.java.nowcoder;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class NumberOf1 {
	public static void main(String[] args){
		System.out.println(count(-9));
	}
	
	public static void and(){
		System.out.println( 1 & 3);
	}
	
	public static int count(int n){
		int c = 0;
		int flag = 1;
		while(flag != 0){
			if((n & flag) != 0){
				c++;
			}
			flag = flag<<1;
		}
		return c;
	}
}
