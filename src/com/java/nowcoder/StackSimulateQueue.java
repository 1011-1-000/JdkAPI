package com.java.nowcoder;

import java.util.Stack;

//��Ŀ����
//
//������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�

public class StackSimulateQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
    	if(stack1.capacity() == stack1.size()){
        	if(stack2.isEmpty()){
        		while(!stack1.isEmpty()){
        			stack2.push(stack1.pop());
        		}
        		stack1.push(node);
        	}
        	return;
        }
    	else{
    		stack1.push(node);
    	}
    }
    
    public int pop() {
    	if(stack2.isEmpty()){
    		if(stack1.isEmpty()){
    			return -1;
    		}
    		else{
    			while(!stack1.isEmpty()){
    				stack2.push(stack1.pop());
    			}
    			return stack2.pop();
    		}
    	}
    	else{
    		return stack2.pop();
    	}
    }
}
