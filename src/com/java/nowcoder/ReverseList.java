package com.java.nowcoder;
//Äæ×ªÁ´±í
public class ReverseList {
	
	public static class ListNode{
		int val;
		ListNode next = null;
		public ListNode(int val){
			this.val = val;
		}
	}
	
	public static ListNode solution(ListNode head){
        ListNode nextNode = head.next;
        head.next = null;
        ListNode tmpNode = null;
        while(nextNode != null){
        	tmpNode = nextNode.next;
        	nextNode.next = head;
        	head = nextNode;
        	nextNode = tmpNode;
        }
        return head;
	}
	
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		ListNode tail = head;
		for(int i = 2; i <= 5; i++){
			ListNode newNode = new ListNode(i);
			tail.next = newNode;
			tail = newNode;
		}
		printList(solution(head));
	}
	
	public static void printList(ListNode head){
		while(head!=null){
			System.out.print(head.val+" ");
			head = head.next;
		}
	}
}
