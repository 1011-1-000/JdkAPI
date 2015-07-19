package org.java.util;

import java.util.List;

public class Other {
	//欧几里得算法
	//求最大公约数
	public static long gcd(long m,long n){
		while(n!=0){
			long r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
	
	public static void removeEvenVerl(List<Integer> lst){
		for(Integer x : lst){
			if(x % 2 == 0){
				lst.remove(x);
			}
		}
	}
}
