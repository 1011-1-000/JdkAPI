package com.java.nowcoder;

import org.java.util.JavaUtils;


//求给定的一列数的最大值 如：-2,11,-4,13,-5,-2 最大值为20

public class MaxSubSum {
	public static void main(String[] args){
		int[] a = {-2,11,-4,13,-5,-2};
		maxSubSum1(a);
		maxSubSum2(a);
		maxSubSum3(a);
		maxSubSum4(a);
	}
	
	//时间复杂度O(n*n)
	public static void maxSubSum1(int[] a){
		long startTime = System.nanoTime();
		int maxSum =0;
		for(int i = 0;i<a.length;++i){
			int thisSum = a[i];
			for(int j = i+1;j<a.length;++j){
				thisSum += a[j];
				if(thisSum > maxSum){
					maxSum = thisSum;
				}
			}
		}
		System.out.println(maxSum);
		JavaUtils.getDuration(startTime);
	}
	
	//时间复杂度O(n*n*n)
	public static void maxSubSum2(int[] a){
		long startTime = System.nanoTime();
		int maxSum = 0;
		for(int i =0;i<a.length;++i){
			for(int j=i;j<a.length;++j){
				int thisSum = 0;
				
				for(int k = i;k<=j;++k){
					thisSum += a[k];
				}
				
				if(thisSum > maxSum){
					maxSum = thisSum;
				}
			}
		}
		System.out.println(maxSum);
		JavaUtils.getDuration(startTime);
	}
	
	//时间复杂度O(nlogn)
	public static void maxSubSum3(int[] a){
		long startTime = System.nanoTime();
		System.out.println(maxSumRec(a,0,a.length-1));
		JavaUtils.getDuration(startTime);
	}
	
	//时间复杂度O(n)
	public static void maxSubSum4(int[] a){
		long startTime = System.nanoTime();
		int maxSum = 0,thisSum = 0;
		
		for(int j = 0; j<a.length;++j){
			thisSum +=a[j];
			if(thisSum > maxSum){
				maxSum = thisSum;
			}
			else if(thisSum < 0){
				thisSum = 0;
			}
		}
		
		System.out.println(maxSum);
		JavaUtils.getDuration(startTime);
	}
	
	private static int maxSumRec(int[] a,int left,int right){
		if(left == right){
			if(a[left]>0){
				return a[left];
			}
			else{
				return 0;
			}
		}
		
		int center = (left + right)/2;
		int maxLeftSum = maxSumRec(a,left,center);
		int maxRightSum = maxSumRec(a,center+1,right);
		
		int maxLeftBorderSum = 0,leftBorderSum = 0;
		for(int i = center;i >= left;--i){
			leftBorderSum += a[i];
			if(leftBorderSum > maxLeftBorderSum){
				maxLeftBorderSum = leftBorderSum;
			}
		}
		
		int maxRightBorderSum = 0,rightBorderSum = 0;
		for(int i = center + 1;i <= right;++i){
			rightBorderSum += a[i];
			if(rightBorderSum > maxRightBorderSum){
				maxRightBorderSum = rightBorderSum;
			}
		}
		
		int centerSum = maxLeftBorderSum+maxRightBorderSum;
		return maxLeftSum>(maxRightSum>centerSum?maxRightSum:centerSum)?maxLeftSum:(maxRightSum>centerSum?maxRightSum:centerSum);
	}
}
