package com.java.nowcoder;

import com.java.nowcoder.ReverseList.ListNode;

public class DeleteDuplication {
	public static ListNode deleteDuplication(ListNode pHead)
    {
		if(pHead == null){
			return null;
		}
		ListNode pre = null;
        ListNode current = pHead;
        ListNode behind = current.next;
        
        
        while(behind != null){
            if(current.val != behind.val){
                pre = current;
                current = pre.next;
                behind = current.next;
            }
            else{
                while(behind != null && current.val == behind.val){
                    current.next = behind.next;
                    behind = current.next;
                }
                
                if(pre == null){
                    pHead = current.next;
                    current.next = null;
                    current = pHead;
                    if(current != null){
                    	behind = current.next;
                    }
                }
                else{
                    pre.next = behind;
                    current = behind;
                    if(current != null){
                    	behind = current.next;
                    }
                }
                
            }
        }
        
        return pHead;
    }
	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode tail = head;
		for(int i = 2; i <= 5; i++){
			ListNode newNode = new ListNode(1);
			tail.next = newNode;
			tail = newNode;
		}
//		ListNode newNode = new ListNode(5);
//		tail.next = newNode;
//		tail = newNode;
		printList(deleteDuplication(null));
	}
	
	public static void printList(ListNode head){
		while(head!=null){
			System.out.print(head.val+" ");
			head = head.next;
		}
	}
}
