package com.java.nowcoder;

import java.util.Stack;

public class FindFirstCommonNode {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		Stack<ListNode> s1 = new Stack<ListNode>();
		Stack<ListNode> s2 = new Stack<ListNode>();
		
		ListNode p = pHead1;
		ListNode q = pHead2;
		ListNode r = null;
		while(p != null){
			s1.push(p);
			p = p.next;
		}
		
		while(q != null){
			s2.push(q);
			q = q.next;
		}
		
		while(!s1.isEmpty() && !s2.isEmpty()){
			if(s1.peek() == s2.peek()){
				r = s1.pop();
				s2.pop();
			}
			else{
				break;
			}
		}
		
		return r;
    }
}
