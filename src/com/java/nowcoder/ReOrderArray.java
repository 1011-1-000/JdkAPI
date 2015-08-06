package com.java.nowcoder;

//����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
//���е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
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
