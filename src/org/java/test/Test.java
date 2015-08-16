package org.java.test;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Test {
	
	public static void main(String[] args){
	}
	
	public static void quickSort(int[] input,int start,int end){
		int pivot;
		if(start < end){
			pivot = patition(input,start,end);
			quickSort(input,start,pivot-1);
			quickSort(input,pivot+1,end);
		}
    }

	private static int patition(int[] input, int start, int end) {
		int pivotkey = input[start];  
        //枢轴选定后永远不变，最终在中间，前小后大  
        while (start < end) {  
            while (start < end && input[end] >= pivotkey) --end;  
            //将比枢轴小的元素移到低端，此时end位相当于空，等待低位比pivotkey大的数补上  
            input[start] = input[end];  
            while (start < end && input[start] <= pivotkey) ++start;  
            //将比枢轴大的元素移到高端，此时start位相当于空，等待高位比pivotkey小的数补上  
            input[end] = input[start];  
        }  
        //当start == end，完成一趟快速排序，此时start位相当于空，等待pivotkey补上  
        input[start] = pivotkey;  
        return start;  
	}
}
