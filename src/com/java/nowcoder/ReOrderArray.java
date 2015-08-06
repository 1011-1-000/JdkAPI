package com.java.nowcoder;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
//所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class ReOrderArray {
	public static void solution(int[] array){
		int n = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				n++;
			}
		}
		int[] tmp = new int[n];
		n = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				tmp[n++] = array[i];
			}
			else{
				array[i - n] = array[i];
			}
		}
		System.arraycopy(tmp, 0, array, array.length - n, n);
	}
	
	public static void main(String[] args){
		int[] array = {1,2,4,6,7,8,3,2,9,9,9,9,9,9,9};
		solution(array);
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
