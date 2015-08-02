package org.java.test;

import org.java.util.JavaUtils;
import org.java.util.Sort;

public class TestSort {

	/**
	 * @param args
	 */
	//从测试结果来看，排序速度堆>归并>快速>冒泡>插入 这些是在序列最坏情况下的大致比较
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM = 10000;
		Integer a[] = new Integer[NUM];
		Integer b[] = new Integer[NUM];
		Integer c[] = new Integer[NUM];
		Integer d[] = new Integer[NUM];
		Integer e[] = new Integer[NUM];
		
		for(int i = 0; i < NUM; i++){
			a[NUM - i - 1] = i;
			b[NUM - i - 1] = i;
			c[NUM - i - 1] = i;
			d[NUM - i - 1] = i;
			e[NUM - i - 1] = i;
		}
		long startTime = System.nanoTime();
		Sort.insertionSort(a);
		JavaUtils.getDuration(startTime);
		startTime = System.nanoTime();
		Sort.heapSort(b);
		JavaUtils.getDuration(startTime);
		startTime = System.nanoTime();
		Sort.mergeSort(c);
		JavaUtils.getDuration(startTime);
		startTime = System.nanoTime();
		Sort.quickSort(d);
		JavaUtils.getDuration(startTime);
		startTime = System.nanoTime();
		Sort.bubbleSort(e);
		JavaUtils.getDuration(startTime);
	}
	
	public static<AnyType> void printArray(AnyType[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
