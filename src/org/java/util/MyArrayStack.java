package org.java.util;

public class MyArrayStack<AnyType> {
	private int DEFAULT_CAPACITY = 10;
	
	//不仅指明了大小，也标示着下一个加入元素的位置
	private int theSize;
	private AnyType[] theItems;
	
	public MyArrayStack(){
		clear();
	}
	
	public void clear(){
		theSize = 0;
		ensureCapacity(DEFAULT_CAPACITY);
	}
	
	public int size(){
		return theSize;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public boolean push(AnyType x){
		if(theItems.length == size()){
			ensureCapacity(size()*2+1);
		}
		
		theItems[theSize++] = x;
		return true;
	}
	
	public AnyType pop(){
		
		if(size()==0){
			return null;
		}
		else{
			return theItems[--theSize];
		}
	}
	
	public AnyType peek(){
		if(size()==0){
			return null;
		}
		else{
			return theItems[theSize-1];
		}
	}
	
	public void ensureCapacity(int newCapacity){
		if(newCapacity < size()){
			return;
		}
		
		AnyType[] old = theItems;
		theItems = (AnyType[]) new Object[newCapacity];
		for(int i = 0;i<size();++i){
			theItems[i] = old[i];
		}
	}
	
	public String toString(){
		System.out.print("栈顶到栈底：");
		if(size()==0){
			return "[]";
		}
		int i = theSize-1;
		StringBuffer sb = new StringBuffer("["+theItems[i--]);
		while(i>=0){
			sb.append(","+theItems[i--]);
		}
		sb.append("]");
		return sb.toString();
	}
}
