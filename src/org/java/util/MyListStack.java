package org.java.util;

public class MyListStack<AnyType> {
	private int theSize;
	private int modCount = 0; 
	private Node<AnyType> beginMarker;
	
	private static class Node<AnyType>{
		private AnyType data;
		private Node<AnyType> next;
		
		public Node(AnyType d,Node<AnyType> p){
			data = d;
			next = p;
		}
	}
	
	public MyListStack(){
		clear();
	}

	private void clear() {
		// TODO Auto-generated method stub
		theSize = 0;
		Node<AnyType> p = new Node<AnyType>(null,null);
		beginMarker = p;
		modCount++;
	}
	
	public int size(){
		return theSize;
	}
	
	public boolean isEmpty(){
		return size()==0;
	}
	
	public boolean push(AnyType x){
		Node<AnyType> p = new Node<AnyType>(x,beginMarker.next);
		beginMarker.next = p;
		theSize++;
		modCount++;
		return true;
	}
	
	public AnyType pop(){
		if(size()==0){
			return null;
		}
		Node<AnyType> p = beginMarker.next;
		beginMarker.next = p.next;
		theSize--;
		modCount++;
		return p.data;
	}
	
	public AnyType peek(){
		if(size()==0){
			return null;
		}
		else{
			return beginMarker.next.data;
		}
	}
	
	public String toString(){
		System.out.print("Õ»¶¥µ½Õ»µ×£º");
		if(size()==0){
			return "[]";
		}
		Node<AnyType> p = beginMarker.next;
		StringBuffer sb = new StringBuffer("["+p.data);
		p=p.next;
		
		while(p!=null){
			sb.append(","+p.data);
			p = p.next;
		}
		
		sb.append("]");
		return sb.toString();
	}
}
