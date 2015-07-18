package org.java.util;

public class DurationTime {
	public static void getDuration(long startTime){
		System.out.println("程序运行时间："+(System.nanoTime()-startTime)+"纳秒");
	}
}
