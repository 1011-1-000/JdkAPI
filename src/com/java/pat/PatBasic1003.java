package com.java.pat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PatBasic1003 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		int flag = 0;
		int i = 0;
		int num = 2;
		while(i < n){
			if(isPrime(num)){
				i++;
				if(i >= m && i <= n){
					prime.add(num);
				}
			}
			num++;
		}
		
		Iterator it = prime.iterator();
		while(it.hasNext()){
			flag++;
			if(flag % 10 == 0 || flag == prime.size()){
				System.out.println(it.next());
			}
			else{
				System.out.print(it.next()+" ");
			}
		}
	}
	
	private static boolean isPrime(long n) {
	    if (n <= 3) {
	        return n > 1;
	    }
	    if (n % 2 == 0 || n % 3 == 0) {
	        return false;
	    }
	 
	    for (int i = 5; i * i <= n; i += 6) {
	        if (n % i == 0 || n % (i + 2) == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
