package com.java.nowcoder;

public class Multiply {
	public static int[] multiply(int[] A) {
		int[] leftToRight = new int[A.length];
		int[] rightToLeft = new int[A.length];
		int[] B = new int[A.length];
		if(A.length == 0){
			return B;
		}
		int productLTR = 1;
		int productRTL = 1;
		for(int i = 0,j = A.length - 1; i < A.length && j >= 0; i++,j--){
			leftToRight[i] = productLTR;
			productLTR *= A[i];
			rightToLeft[j] = productRTL;
			productRTL *= A[j];
		}
		for(int i = 0; i < A.length; i++){
			B[i] = leftToRight[i] * rightToLeft[i];
		}
		return B;
    }
	
	public static void main(String[] args){
		int[] numbers = {1,2,3,4,5};
		int[] B = multiply(numbers);
		System.out.println();
		for(int i = 0; i <B.length; i++){
			System.out.print(B[i]+" ");
		}
	}
}
