package org.java.util;

import org.java.util.MyArrayList.ArrayListIterator;

public class Octopress {
	public class MyArrayList<AnyType> implements Iterable<AnyType>{
		private int theSize;
		private AnyType[] theItems;
		
		public java.util.Iterator<AnyType> iterator(){
			return new ArrayListIterator();
		}
	}
	
	class ArrayListIterator implements java.util.Iterator<AnyType>{
		private int current = 0;
		
		public boolean hasNext(){
			return current < size();
		}
		
		public AnyType next(){
			if(!hasNext()){
				throw new java.util.NoSuchElementException();
			}
			return theItems[current++];
		}
	}
}
