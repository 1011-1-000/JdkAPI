package org.java.util;

public class Other {
	//ŷ������㷨
	//�����Լ��
	public static long gcd(long m,long n){
		while(n!=0){
			long r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
}
