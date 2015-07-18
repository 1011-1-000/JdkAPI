package org.java.util;

public class JavaUtils {
	
	//获取程序运行时间
	public static void getDuration(long startTime){
		System.out.println("程序运行时间："+(System.nanoTime()-startTime)+"纳秒");
	}
	//时间复杂度O(logN)
	//折半查找算法
	public static <AnyType extends Comparable<? super AnyType>> int binarySearch(AnyType[] a,AnyType x){
		int low = 0;
		int high = a.length - 1;
		while(low <= high){
			int mid = (low + high)/2;
			
			if(a[mid].compareTo(x)<0){
				low = low + 1;
			}
			else if(a[mid].compareTo(x)>0){
				high = high -1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
}
