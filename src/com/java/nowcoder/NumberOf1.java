package com.java.nowcoder;
//����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
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
