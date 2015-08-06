package com.java.nowcoder;

import java.util.ArrayList;
import java.util.Collections;

//输入一个链表，输出该链表中倒数第k个结点。
public class FindKthToTail {
	public static class ListNode{
		 int val;
		 ListNode next = null;
		 ListNode(int val){
			 this.val = val;
		 }
	}
	
	public ListNode solution(ListNode head,int k) {
        ArrayList<ListNode> list = new ArrayList<ListNode>();
		ListNode node = head.next;
        while(node != null){
            list.add(node);
        }
        return list.get(list.size() - k);
    }
	
	public static ListNode solution1(ListNode head,int k){
		if(head == null){
            return null;
        }
		ListNode p = head;
        ListNode q = null;
        int i = 0;
        while(p != null){
            if(i == k - 1){
                q = head;
            }
            i++;
            p = p.next;
            if(q != null && p != null){
                q = q.next;
            }
        }
        if(i < k){
            return null;
        }
        else {
            return q;
        }
	}
	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode tail = head;
		for(int i = 2; i <= 5; i++){
			ListNode newNode = new ListNode(i);
			tail.next = newNode;
			tail = newNode;
		}
		System.out.println(solution1(head,5).val);
	}
}
