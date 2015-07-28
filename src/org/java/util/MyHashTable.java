package org.java.util;

import java.util.LinkedList;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class MyHashTable<AnyType> {
	
	Hashtable t = new Hashtable();
	
	private static final int DEFALUT_TABLE_SIZE = 101;
	private List<AnyType>[] theLists;
	private int currentSize;
	
	public MyHashTable(){
		this(DEFALUT_TABLE_SIZE);
	}
	
	public MyHashTable(int size){
		theLists = new LinkedList[nextPrime(size)];
		for(int i = 0;i < theLists.length; ++i){
			theLists[i] = new LinkedList<AnyType>();
		}
	}
	
	private int nextPrime(int n) {
		// TODO Auto-generated method stub
		if( n % 2 == 0 )
            n++;

        for( ; !isPrime( n ); n += 2 )
            ;

        return n;
	}

	private boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if( n == 2 || n == 3 )
            return true;

        if( n == 1 || n % 2 == 0 )
            return false;

        for( int i = 3; i * i <= n; i += 2 )
            if( n % i == 0 )
                return false;

        return true;
	}

	public void insert(AnyType x){
		List<AnyType> whichList = theLists[myHash(x)];
		if(!whichList.contains(x)){
			whichList.add(x);
			
			if(++currentSize > theLists.length){
				rehash();
			}
		}
	}
	
	public void remove(AnyType x){
		List<AnyType> whichList = theLists[myHash(x)];
		if(whichList.contains(x)){
			whichList.remove(x);
			currentSize --;
		}
	}
	
	public boolean contains(AnyType x){
		List<AnyType> whichList = theLists[myHash(x)];
		return whichList.contains(x);
	}
	
	public void makeEmpty(){
		for(int i = 0; i<theLists.length;++i){
			theLists[i].clear();
		}
		currentSize = 0;
	}
	
	private void rehash(){
		List<AnyType>[] oldList = theLists;
		
		theLists = new List[nextPrime(2*theLists.length)];
		for(int j = 0;j<theLists.length;j++){
			theLists[j] = new LinkedList<AnyType>();
		}
		currentSize = 0;
		
		for(int i = 0;i< oldList.length;i++){
			for(AnyType item : oldList[i]){
				insert(item);
			}
		}
	}
	
	private int myHash(AnyType x){
		
		int hashVal = x.hashCode();
		
		hashVal %= theLists.length;
		if(hashVal < 0){
			hashVal += theLists.length;
		}
		return hashVal;
	}
}
