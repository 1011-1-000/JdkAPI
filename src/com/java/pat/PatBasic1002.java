package com.java.pat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PatBasic1002 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] mod = {"N","N","N","N","N"};
        int sumEven = 0;
        int sumMod1 = 0;
        int sign1 = -1;
        int count2 = 0;
        int sumMod3 = 0;
        int count3 = 0;
        int max4 = Integer.MIN_VALUE;
        int result = 0;
        for(int i = 0; i < n; i++){
            int cin = in.nextInt();
            result = cin % 5;
            switch(result){
                case 0: {
                    if(cin % 2 == 0){
                    	sumEven += cin;
                    }
                    break;
                }
                case 1: {
                	sign1 = sign1*(-1);
                    sumMod1 += sign1*cin;
                    break;
                }
                case 2: {
                    count2++;
                    break;
                }
                case 3: {
                    sumMod3 += cin;
                    count3++;
                    break;
                }
                case 4: {
                    if(cin > max4){
                        max4 = cin;
                    }
                    break;
                }
            } 
        }
        if(sumEven != 0){
        	mod[0] = String.valueOf(sumEven);
        }
        if(sumMod1 != 0){
        	mod[1] = String.valueOf(sumMod1);
        }
        if(count2 != 0){
        	mod[2] = String.valueOf(count2);
        }
        if(count3 != 0){
            mod[3] = new DecimalFormat("0.0").format((double)sumMod3/count3); 
        }
        if(max4 != Integer.MIN_VALUE){
        	mod[4] = String.valueOf(max4);
        }
        System.out.println(mod[0]+" "+mod[1]+" "+mod[2]+" "+mod[3]+" "+mod[4]);
    }
}
