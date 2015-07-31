package org.java.test;

import org.java.util.Sort;

public class TestSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {3,6,2,1,7,6,5,8,10,9,11,43,34,56};
//		Sort.insertionSort(a);
//		Sort.heapSort(a);
//		Sort.mergeSort(a);
//		Sort.quickSort(a);
		Sort.bubbleSort(a);
		printArray(a);
	}
	
	public static<AnyType> void printArray(AnyType[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
