package com.java.nowcoder;

import java.util.ArrayList;

public class PrintMatrix {
	
	public static void main(String[] args){
		int[][] matrix = {{1,2,3},{4,5,6}};
		System.out.println(printMatrix(matrix));
	}
	
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        while(i <= m && j <= n){
            result.addAll(printSubArray(i,j,m,n,matrix));
            i++;
            j++;
            m--;
            n--;
        }
		return result;
    }
    
    public static ArrayList<Integer> printSubArray(int i,int j,int m,int n,int[][] matrix){
    	ArrayList<Integer> list = new ArrayList<Integer>();
        int p = j;
        while(p <= n){//向右打印
            list.add(matrix[i][p++]);
        }
        p = i + 1;
        while(p <= m && i < m){//向下打印
            list.add(matrix[p++][n]);
        }
        p = n - 1;
        while(p >= i && j < n && i <m){ 
            list.add(matrix[m][p--]);
        }
        p = m - 1;
        while(p > i && j < n && i < m){
            list.add(matrix[p--][j]);
        }
        return list;
    }
}
