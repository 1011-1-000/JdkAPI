package com.java.nowcoder;

import com.java.nowcoder.FindKthToTail.ListNode;
//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Merge {
	public static ListNode solution(ListNode list1,ListNode list2) {
		if(list1 == null ){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
        ListNode p1 = null;
        ListNode p2 = null;
        ListNode head = null;
        ListNode tail = null;
        
        if(list1.val < list2.val){
            head = list1;
            tail = list1;
            p1 = list1.next;
            p2 = list2;
        }
        else{
            head = list2;
            tail = list2;
            p1 = list1;
            p2 = list2.next;
        }
        
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                tail.next = p1;
                tail = p1;
                p1 = p1.next;
            }
            else{
                tail.next = p2;
                tail = p2;
                p2 = p2.next;
            }
        }
        
        while(p1 != null){
            tail.next = p1;
            tail = p1;
            p1 = p1.next;
        }
        
        while(p2 != null){
            tail.next = p2;
            tail = p2;
            p2 = p2.next;
        }
        
        return head;
    }
	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode tail = head;
		for(int i = 3; i <= 5; i = i+2){
			ListNode newNode = new ListNode(i);
			tail.next = newNode;
			tail = newNode;
		}
		ListNode head1 = new ListNode(2);
		tail = head1;
		for(int i = 4; i <= 6; i = i+2){
			ListNode newNode = new ListNode(i);
			tail.next = newNode;
			tail = newNode;
		}
		printList(head);
		printList(head1);
		printList(solution(head,head1));
	}
	
	public static void printList(ListNode head){
		while(head!=null){
			System.out.print(head.val+" ");
			head = head.next;
		}
	}
}
