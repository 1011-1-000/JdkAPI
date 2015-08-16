package com.java.nowcoder;

public class Add {
	public static int Add(int num1,int num2) {
		if(num2 == 0){
			return num1;
		}
		else{
			return Add(num1^num2, (num1&num2)<<1);
		}
    }
	
	public static void main(String[] args ){
		System.out.println(Add(45,30));
	}
}
