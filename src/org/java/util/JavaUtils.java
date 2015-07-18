package org.java.util;

public class JavaUtils {
	
	//��ȡ��������ʱ��
	public static void getDuration(long startTime){
		System.out.println("��������ʱ�䣺"+(System.nanoTime()-startTime)+"����");
	}
	//ʱ�临�Ӷ�O(logN)
	//�۰�����㷨
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
