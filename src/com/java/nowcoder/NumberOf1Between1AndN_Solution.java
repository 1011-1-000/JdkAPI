package com.java.nowcoder;

import java.util.ArrayList;
import java.util.Stack;

public class NumberOf1Between1AndN_Solution {
	public static void main(String[] args){
		System.out.println(numberOf1Between1AndN_Solution(200));
	}
	
	public static int numberOf1Between1AndN_Solution(int n){
		 int iCount = 0;
	        int iFactor = 1;
	        int iLowerNum = 0;
	        int iCurrNum = 0;
	        int iHigherNum = 0;
	        while (n / iFactor != 0){
	            iLowerNum = n % iFactor;
	            iCurrNum = (n / iFactor) % 10;
	            iHigherNum = n / (iFactor * 10);
	            switch (iCurrNum){
	                case 0:
	                    iCount += iHigherNum * iFactor;
	                    break;
	                case 1:
	                    iCount += iHigherNum * iFactor + iLowerNum + 1;
	                    break;
	                default:
	                    iCount += (iHigherNum + 1) * iFactor;
	                    break;
	            }
	            iFactor *= 10;
	        }
	        return iCount;
	}
}
