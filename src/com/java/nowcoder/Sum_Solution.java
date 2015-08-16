package com.java.nowcoder;

public class Sum_Solution {
    public static int Sum_Solution(int n) {
    	int result = (int) (Math.pow(n, 2) + n);
        return result >> 1;
    }
    
    public static void main(String[] args){
    	System.out.println(Sum_Solution(100));
    }
}
