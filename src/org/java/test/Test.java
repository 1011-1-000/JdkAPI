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
        //����ѡ������Զ���䣬�������м䣬ǰС���  
        while (start < end) {  
            while (start < end && input[end] >= pivotkey) --end;  
            //��������С��Ԫ���Ƶ��Ͷˣ���ʱendλ�൱�ڿգ��ȴ���λ��pivotkey���������  
            input[start] = input[end];  
            while (start < end && input[start] <= pivotkey) ++start;  
            //����������Ԫ���Ƶ��߶ˣ���ʱstartλ�൱�ڿգ��ȴ���λ��pivotkeyС��������  
            input[end] = input[start];  
        }  
        //��start == end�����һ�˿������򣬴�ʱstartλ�൱�ڿգ��ȴ�pivotkey����  
        input[start] = pivotkey;  
        return start;  
	}
}
