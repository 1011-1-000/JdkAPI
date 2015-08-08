package com.java.nowcoder;

import java.util.Stack;

public class IsPopOrder {
	public static boolean isPopOrder(int [] pushA,int [] popA){
		if(pushA.length != popA.length){
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        while(i < pushA.length && pushA[i] != popA[0]){
            stack.push(pushA[i++]);
        }
        if(i < pushA.length){
        	stack.push(pushA[i++]);
        }
        //³õÊ¼»¯
        
        for(int j = 0;j < popA.length;){
            
            if(stack.peek().equals(popA[j])){
                stack.pop();
                j++;
            }
            else{
                while(i < pushA.length && pushA[i] != popA[j]){
                    stack.push(pushA[i++]);
                }
                if(i < pushA.length){
                    stack.push(pushA[i++]);
                }
                else{
                	return false;
                }
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
	}
	
	public static void main(String[] args){
		int[] pushA = {1};
		int[] popA = {2};
		System.out.println(isPopOrder(pushA,popA));
	}
}
